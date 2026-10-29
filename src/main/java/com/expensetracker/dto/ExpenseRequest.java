package com.expensetracker.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class ExpenseRequest {
    @NotNull(message = "Amount is required")
    private BigDecimal amount;
    
    @NotNull(message = "Date incurred is required")
    @PastOrPresent(message = "Date incurred cannot be in the future")
    private LocalDate dateIncurred;
    
    @NotNull(message = "Category ID is required")
    private Long categoryId;
    
    private String description;
    
    private List<String> receipts;
}
