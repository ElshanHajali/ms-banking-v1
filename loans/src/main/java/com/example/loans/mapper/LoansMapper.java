package com.example.loans.mapper;

import com.example.loans.dao.entity.LoansEntity;
import com.example.loans.dto.LoansResponse;

public class LoansMapper {
    public static LoansResponse toResponse(LoansEntity loan) {
        return LoansResponse.builder()
                .createDt(loan.getCreateDt())
                .outstandingAmount(loan.getOutstandingAmount())
                .amountPaid(loan.getAmountPaid())
                .customerId(loan.getCustomerId())
                .totalLoan(loan.getTotalLoan())
                .startDt(loan.getStartDt())
                .type(loan.getType())
                .build();
    }
}
