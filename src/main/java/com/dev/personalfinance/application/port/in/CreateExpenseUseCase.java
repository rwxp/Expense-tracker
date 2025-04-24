package com.dev.personalfinance.application.port.in;

import com.dev.personalfinance.domain.models.Expense;
import com.dev.personalfinance.infrastructure.adapter.in.rest.dto.ExpenseRequest;

public interface CreateExpenseUseCase{

    Expense createExpense(ExpenseRequest expense);

}