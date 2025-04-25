package com.dev.personalfinance.domain.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense {

    private Long id;
    private String title;
    private Long amount;
    private String date;
    private String description;
    private String category;
}
