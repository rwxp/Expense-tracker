package com.dev.personalfinance.infrastructure.adapter.in.rest;

import com.dev.personalfinance.application.port.in.CreateExpenseUseCase;
import com.dev.personalfinance.domain.models.Expense;
import com.dev.personalfinance.infrastructure.adapter.in.rest.dto.ExpenseRequest;
import com.dev.personalfinance.infrastructure.adapter.in.rest.dto.ExpenseResponse;
import com.dev.personalfinance.infrastructure.adapter.in.rest.mapper.ExpenseMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final CreateExpenseUseCase createExpenseUseCase;
    private final ExpenseMapper expenseMapper;

    public ExpenseController(CreateExpenseUseCase createExpenseUseCase, ExpenseMapper expenseMapper) {
        this.createExpenseUseCase = createExpenseUseCase;
        this.expenseMapper = expenseMapper;
    }

    @PostMapping
    public ResponseEntity<ExpenseResponse> createExpense(@RequestBody ExpenseRequest request) {
        Expense createdExpense = createExpenseUseCase.createExpense(request);
        ExpenseResponse response = expenseMapper.toResponse(createdExpense);

        return ResponseEntity.ok(response);
    }


}
