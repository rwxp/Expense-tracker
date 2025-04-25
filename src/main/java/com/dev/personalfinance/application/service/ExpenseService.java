package com.dev.personalfinance.application.service;

import com.dev.personalfinance.application.port.in.CreateExpenseUseCase;
import com.dev.personalfinance.domain.models.Expense;
import com.dev.personalfinance.domain.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService implements CreateExpenseUseCase {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense createExpense(Expense expense) {
        return expenseRepository.saveExpense(expense);
    }

}
