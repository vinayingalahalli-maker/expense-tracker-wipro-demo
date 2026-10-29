package com.expensetracker.dto;

import com.expensetracker.entity.Expense;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ExpenseResponse {
    private Long id;
    private BigDecimal amount;
    private LocalDate dateIncurred;
    private Long categoryId;
    private String categoryName;
    private String description;
    private Long claimId;
    private List<String> receipts;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public static ExpenseResponse from(Expense expense) {
        ExpenseResponse response = new ExpenseResponse();
        response.setId(expense.getId());
        response.setAmount(expense.getAmount());
        response.setDateIncurred(expense.getDateIncurred());
        response.setCategoryId(expense.getCategory().getId());
        response.setCategoryName(expense.getCategory().getName());
        response.setDescription(expense.getDescription());
        response.setClaimId(expense.getClaim() != null ? expense.getClaim().getId() : null);
        response.setReceipts(expense.getReceipts());
        response.setCreatedAt(expense.getCreatedAt());
        response.setUpdatedAt(expense.getUpdatedAt());
        return response;
    }
}
