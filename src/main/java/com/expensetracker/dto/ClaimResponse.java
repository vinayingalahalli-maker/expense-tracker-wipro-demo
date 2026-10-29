package com.expensetracker.dto;

import com.expensetracker.entity.Claim;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ClaimResponse {
    private Long id;
    private String status;
    private LocalDateTime submittedAt;
    private String rejectionReason;
    private BigDecimal totalAmount;
    private Integer expenseCount;
    
    public static ClaimResponse from(Claim claim) {
        ClaimResponse response = new ClaimResponse();
        response.setId(claim.getId());
        response.setStatus(claim.getStatus().name());
        response.setSubmittedAt(claim.getSubmittedAt());
        response.setRejectionReason(claim.getRejectionReason());
        response.setTotalAmount(claim.getTotalAmount());
        response.setExpenseCount(claim.getExpenseCount());
        return response;
    }
}
