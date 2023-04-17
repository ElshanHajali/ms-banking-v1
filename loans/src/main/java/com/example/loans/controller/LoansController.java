package com.example.loans.controller;

import com.example.loans.dto.LoansResponse;
import com.example.loans.service.LoansService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("loans")
@RequiredArgsConstructor
public class LoansController {
    private final LoansService loansService;

    @GetMapping("customers/{customerId}")
    public List<LoansResponse> getLoansByCustomerId(@PathVariable Long customerId) {
        return loansService.getLoansByCustomerId(customerId);
    }
}
