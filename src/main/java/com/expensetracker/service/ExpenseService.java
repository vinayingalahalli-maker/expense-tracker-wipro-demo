package com.expensetracker.service;

import com.expensetracker.dto.ExpenseRequest;
import com.expensetracker.dto.ExpenseResponse;
import com.expensetracker.entity.Category;
import com.expensetracker.entity.Expense;
import com.expensetracker.exception.BusinessRuleException;
import com.expensetracker.exception.ResourceNotFoundException;
import com.expensetracker.repository.CategoryRepository;
import com.expensetracker.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {
    
    private final ExpenseRepository expenseRepository;
    private final CategoryRepository categoryRepository;
    
    @Transactional
    public ExpenseResponse createExpense(ExpenseRequest request, String userId) {
        validateExpenseRequest(request);
        
        Category category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id: " + request.getCategoryId()));
        
        // Validate receipt requirement
        if (request.getAmount().compareTo(category.getReceiptThreshold()) > 0) {
            if (request.getReceipts() == null || request.getReceipts().isEmpty()) {
                throw new BusinessRuleException("Receipt is required for expenses exceeding " + category.getReceiptThreshold());
            }
        }
        
        Expense expense = new Expense();
        expense.setAmount(request.getAmount());
        expense.setDateIncurred(request.getDateIncurred());
        expense.setCategory(category);
        expense.setDescription(request.getDescription());
        expense.setReceipts(request.getReceipts());
        expense.setUserId(userId);
        
        Expense saved = expenseRepository.save(expense);
        return ExpenseResponse.from(saved);
    }
    
    public Page<ExpenseResponse> getExpenses(String userId, Pageable pageable) {
        return expenseRepository.findByUserId(userId, pageable)
                .map(ExpenseResponse::from);
    }
    
    public ExpenseResponse getExpenseById(Long id) {
        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Expense not found with id: " + id));
        return ExpenseResponse.from(expense);
    }
    
    @Transactional
    public ExpenseResponse updateExpense(Long id, ExpenseRequest request) {
        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Expense not found with id: " + id));
        
        if (expense.getClaim() != null) {
            throw new BusinessRuleException("Cannot update expense that is part of a claim");
        }
        
        validateExpenseRequest(request);
        
        Category category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id: " + request.getCategoryId()));
        
        // Validate receipt requirement
        if (request.getAmount().compareTo(category.getReceiptThreshold()) > 0) {
            if (request.getReceipts() == null || request.getReceipts().isEmpty()) {
                throw new BusinessRuleException("Receipt is required for expenses exceeding " + category.getReceiptThreshold());
            }
        }
        
        expense.setAmount(request.getAmount());
        expense.setDateIncurred(request.getDateIncurred());
        expense.setCategory(category);
        expense.setDescription(request.getDescription());
        expense.setReceipts(request.getReceipts());
        
        Expense updated = expenseRepository.save(expense);
        return ExpenseResponse.from(updated);
    }
    
    @Transactional
    public void deleteExpense(Long id) {
        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Expense not found with id: " + id));
        
        if (expense.getClaim() != null) {
            throw new BusinessRuleException("Cannot delete expense that is part of a claim");
        }
        
        expenseRepository.deleteById(id);
    }
    
    private void validateExpenseRequest(ExpenseRequest request) {
        // Validate date is not in the future
        if (request.getDateIncurred().isAfter(LocalDate.now())) {
            throw new BusinessRuleException("Expense date cannot be in the future");
        }
        
        // Validate date is not older than 90 days
        LocalDate ninetyDaysAgo = LocalDate.now().minusDays(90);
        if (request.getDateIncurred().isBefore(ninetyDaysAgo)) {
            throw new BusinessRuleException("Expense date cannot be older than 90 days");
        }
    }
    
    public List<Expense> getExpensesByIds(List<Long> expenseIds) {
        return expenseRepository.findAllById(expenseIds);
    }
}
