package com.dev.personalfinance.infrastructure.adapter.in.rest.dto;

import lombok.Value;

public record ExpenseResponse(Long id, String description, double amount, String date, String category) {
}