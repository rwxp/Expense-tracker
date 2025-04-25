package com.dev.personalfinance.infrastructure.adapter.out.persistence.mapper;

import com.dev.personalfinance.domain.models.Expense;
import com.dev.personalfinance.infrastructure.adapter.out.persistence.entity.ExpenseEntity;
import org.springframework.stereotype.Component;

@Component
public class ExpenseEntityMapper {

    public ExpenseEntity toEntity(Expense expense) {
        return ExpenseEntity.builder()
                .id(expense.getId())
                .title(expense.getTitle())
                .amount(expense.getAmount())
                .date(expense.getDate())
                .description(expense.getDescription())
                .category(expense.getCategory())
                .build();
    }

    public Expense toDomain(ExpenseEntity entity) {
        return Expense.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .amount(entity.getAmount())
                .date(entity.getDate())
                .description(entity.getDescription())
                .category(entity.getCategory())
                .build();
    }
}
