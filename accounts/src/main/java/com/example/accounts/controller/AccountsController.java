package com.example.accounts.controller;

import com.example.accounts.dto.response.AccountsResponse;
import com.example.accounts.service.AccountsService;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("accounts")
@RequiredArgsConstructor
public class AccountsController {
    private final AccountsService accountsService;

    @Timed(value = "getAccountsByCustomer.time", description = "Time taken to return Accounts by requested Customer id.")
    @GetMapping("customers/{id}")
    public List<AccountsResponse> getAccountsByCustomer(@PathVariable Long id) {
        return accountsService.getAccountsByCustomer(id);
    }
}
