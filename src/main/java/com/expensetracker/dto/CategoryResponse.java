package com.expensetracker.dto;

import com.expensetracker.entity.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CategoryResponse {
    private Long id;
    private String name;
    private BigDecimal receiptThreshold;
    private Boolean active;
    
    public static CategoryResponse from(Category category) {
        CategoryResponse response = new CategoryResponse();
        response.setId(category.getId());
        response.setName(category.getName());
        response.setReceiptThreshold(category.getReceiptThreshold());
        response.setActive(category.getActive());
        return response;
    }
}
