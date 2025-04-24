package com.dev.personalfinance.infrastructure.adapter.in.rest.dto;

import lombok.Getter;

@Getter
public class ExpenseRequest{
    private String title;

    private Long amount;

    private String date;

    private String description;

    private String category;
}