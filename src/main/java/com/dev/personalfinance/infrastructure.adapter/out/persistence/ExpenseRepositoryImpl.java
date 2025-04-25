package com.dev.personalfinance.infrastructure.adapter.out.persistence;

import com.dev.personalfinance.domain.models.Expense;
import com.dev.personalfinance.domain.repository.ExpenseRepository;
import com.dev.personalfinance.infrastructure.adapter.out.persistence.entity.ExpenseEntity;
import com.dev.personalfinance.infrastructure.adapter.out.persistence.mapper.ExpenseEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ExpenseRepositoryImpl implements ExpenseRepository {

    private final ExpenseJpaRepository expenseJpaRepository;
    private final ExpenseEntityMapper expenseEntityMapper; // Para convertir entre Entity y modelo

    public ExpenseRepositoryImpl(ExpenseJpaRepository expenseJpaRepository, ExpenseEntityMapper expenseEntityMapper) {
        this.expenseJpaRepository = expenseJpaRepository;
        this.expenseEntityMapper = expenseEntityMapper;
    }

    @Override
    public Expense saveExpense(Expense expense) {
        ExpenseEntity entity = expenseEntityMapper.toEntity(expense);
        ExpenseEntity saved = expenseJpaRepository.save(entity);
        return expenseEntityMapper.toDomain(saved);
    }
}
