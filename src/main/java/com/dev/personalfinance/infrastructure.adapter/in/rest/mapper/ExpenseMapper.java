package com.dev.personalfinance.infrastructure.adapter.in.rest.mapper;

import com.dev.personalfinance.domain.models.Expense;
import com.dev.personalfinance.infrastructure.adapter.in.rest.dto.ExpenseRequest;
import com.dev.personalfinance.infrastructure.adapter.in.rest.dto.ExpenseResponse;
import org.springframework.stereotype.Component;

@Component
public class ExpenseMapper {

    public Expense toDomain(ExpenseRequest request) {
        return Expense.builder()
                .title(request.getTitle())
                .amount(request.getAmount())
                .date(request.getDate())
                .description(request.getDescription())
                .category(request.getCategory())
                .build();
    }


    public ExpenseResponse toResponse(Expense expense) {
        return new ExpenseResponse(
                expense.getId(),
                expense.getTitle(),
                expense.getAmount(),
                expense.getCategory(),
                expense.getDate()
        );
    }
}
