package com.dev.personalfinance.infrastructure.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "expenses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Long amount;

    @Column(nullable = false)
    private String date;

    @Column
    private String description;

    @Column
    private String category;
}
