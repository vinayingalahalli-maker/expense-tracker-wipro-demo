package com.expensetracker.dto;

import lombok.Data;

import java.util.List;

@Data
public class ClaimRequest {
    private List<Long> expenseIds;
}
