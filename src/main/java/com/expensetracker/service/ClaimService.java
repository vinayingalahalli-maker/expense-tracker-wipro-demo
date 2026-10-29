package com.expensetracker.service;

import com.expensetracker.dto.ClaimRequest;
import com.expensetracker.dto.ClaimResponse;
import com.expensetracker.entity.Claim;
import com.expensetracker.entity.Expense;
import com.expensetracker.exception.BusinessRuleException;
import com.expensetracker.exception.ResourceNotFoundException;
import com.expensetracker.repository.ClaimRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClaimService {
    
    private final ClaimRepository claimRepository;
    private final ExpenseService expenseService;
    
    @Transactional
    public ClaimResponse createClaim(ClaimRequest request, String userId) {
        Claim claim = new Claim();
        claim.setUserId(userId);
        claim.setStatus(Claim.ClaimStatus.DRAFT);
        
        if (request.getExpenseIds() != null && !request.getExpenseIds().isEmpty()) {
            addExpensesToClaim(claim, request.getExpenseIds());
        }
        
        Claim saved = claimRepository.save(claim);
        return ClaimResponse.from(saved);
    }
    
    public Page<ClaimResponse> getClaims(String userId, String status, Pageable pageable) {
        Page<Claim> claims;
        if (status != null) {
            Claim.ClaimStatus claimStatus = Claim.ClaimStatus.valueOf(status.toUpperCase());
            claims = claimRepository.findByStatus(claimStatus, pageable);
        } else if (userId != null) {
            claims = claimRepository.findByUserId(userId, pageable);
        } else {
            claims = claimRepository.findAll(pageable);
        }
        return claims.map(ClaimResponse::from);
    }
    
    public ClaimResponse getClaimById(Long id) {
        Claim claim = claimRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id: " + id));
        return ClaimResponse.from(claim);
    }
    
    @Transactional
    public ClaimResponse addExpensesToClaim(Long claimId, ClaimRequest request) {
        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id: " + claimId));
        
        if (claim.getStatus() != Claim.ClaimStatus.DRAFT) {
            throw new BusinessRuleException("Can only add expenses to draft claims");
        }
        
        addExpensesToClaim(claim, request.getExpenseIds());
        
        Claim updated = claimRepository.save(claim);
        return ClaimResponse.from(updated);
    }
    
    @Transactional
    public ClaimResponse removeExpenseFromClaim(Long claimId, Long expenseId) {
        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id: " + claimId));
        
        if (claim.getStatus() != Claim.ClaimStatus.DRAFT) {
            throw new BusinessRuleException("Can only remove expenses from draft claims");
        }
        
        Expense expense = claim.getExpenses().stream()
                .filter(e -> e.getId().equals(expenseId))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Expense not found in claim"));
        
        claim.getExpenses().remove(expense);
        expense.setClaim(null);
        
        recalculateClaimTotals(claim);
        
        Claim updated = claimRepository.save(claim);
        return ClaimResponse.from(updated);
    }
    
    @Transactional
    public ClaimResponse submitClaim(Long claimId) {
        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id: " + claimId));
        
        if (claim.getStatus() != Claim.ClaimStatus.DRAFT) {
            throw new BusinessRuleException("Can only submit draft claims");
        }
        
        if (claim.getExpenses().isEmpty()) {
            throw new BusinessRuleException("Cannot submit claim with no expenses");
        }
        
        claim.setStatus(Claim.ClaimStatus.SUBMITTED);
        claim.setSubmittedAt(LocalDateTime.now());
        
        Claim updated = claimRepository.save(claim);
        return ClaimResponse.from(updated);
    }
    
    @Transactional
    public ClaimResponse approveClaim(Long claimId) {
        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id: " + claimId));
        
        if (claim.getStatus() != Claim.ClaimStatus.SUBMITTED) {
            throw new BusinessRuleException("Can only approve submitted claims");
        }
        
        claim.setStatus(Claim.ClaimStatus.APPROVED);
        claim.setRejectionReason(null);
        
        Claim updated = claimRepository.save(claim);
        return ClaimResponse.from(updated);
    }
    
    @Transactional
    public ClaimResponse rejectClaim(Long claimId, String reason) {
        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id: " + claimId));
        
        if (claim.getStatus() != Claim.ClaimStatus.SUBMITTED) {
            throw new BusinessRuleException("Can only reject submitted claims");
        }
        
        claim.setStatus(Claim.ClaimStatus.REJECTED);
        claim.setRejectionReason(reason);
        
        Claim updated = claimRepository.save(claim);
        return ClaimResponse.from(updated);
    }
    
    @Transactional
    public ClaimResponse reimburseCllaim(Long claimId) {
        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id: " + claimId));
        
        if (claim.getStatus() != Claim.ClaimStatus.APPROVED) {
            throw new BusinessRuleException("Can only reimburse approved claims");
        }
        
        claim.setStatus(Claim.ClaimStatus.REIMBURSED);
        
        Claim updated = claimRepository.save(claim);
        return ClaimResponse.from(updated);
    }
    
    @Transactional
    public void deleteClaim(Long claimId) {
        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id: " + claimId));
        
        if (claim.getStatus() != Claim.ClaimStatus.DRAFT) {
            throw new BusinessRuleException("Can only delete draft claims");
        }
        
        claimRepository.deleteById(claimId);
    }
    
    private void addExpensesToClaim(Claim claim, List<Long> expenseIds) {
        List<Expense> expenses = expenseService.getExpensesByIds(expenseIds);
        
        for (Expense expense : expenses) {
            if (expense.getClaim() != null) {
                throw new BusinessRuleException("Expense " + expense.getId() + " is already part of another claim");
            }
            expense.setClaim(claim);
            claim.getExpenses().add(expense);
        }
        
        recalculateClaimTotals(claim);
    }
    
    private void recalculateClaimTotals(Claim claim) {
        BigDecimal total = claim.getExpenses().stream()
                .map(Expense::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        
        claim.setTotalAmount(total);
        claim.setExpenseCount(claim.getExpenses().size());
    }
}
