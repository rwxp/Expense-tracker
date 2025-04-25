// infrastructure/adapter/out/persistence/ExpenseJpaRepository.java
package com.dev.personalfinance.infrastructure.adapter.out.persistence;

import com.dev.personalfinance.infrastructure.adapter.out.persistence.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseJpaRepository extends JpaRepository<ExpenseEntity, Long> {
}
