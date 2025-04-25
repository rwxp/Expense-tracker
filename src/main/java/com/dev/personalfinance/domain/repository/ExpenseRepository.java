package com.dev.personalfinance.domain.repository;

import com.dev.personalfinance.domain.models.Expense;

public interface ExpenseRepository {

    Expense saveExpense(Expense expense);

}