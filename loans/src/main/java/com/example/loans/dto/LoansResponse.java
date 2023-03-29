package com.example.loans.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoansResponse {

    private String type;
    private Long customerId;
    private LocalDateTime startDt;
    private String createDt;
    private Integer totalLoan;
    private Integer amountPaid;
    private Integer outstandingAmount;

}
