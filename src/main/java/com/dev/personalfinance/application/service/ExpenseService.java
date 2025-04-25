import com.dev.personalfinance.application.port.in.CreateExpenseUseCase;
import com.dev.personalfinance.domain.models.Expense;
import com.dev.personalfinance.domain.repository.ExpenseRepository;
import com.dev.personalfinance.infrastructure.adapter.in.rest.dto.ExpenseRequest;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService implements CreateExpenseUseCase {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense createExpense(Expense expense) {
        createdExpense = expenseRepository.saveExpense(expense);
        return createdExpense;
    }

}
