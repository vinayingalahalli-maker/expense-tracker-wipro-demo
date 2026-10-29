package com.expensetracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CategoryRequest {
    @NotBlank(message = "Category name is required")
    private String name;
    
    @NotNull(message = "Receipt threshold is required")
    private BigDecimal receiptThreshold;
    
    private Boolean active = true;
}
