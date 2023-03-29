package com.example.accounts.controller;

import com.example.accounts.dto.response.AccountsResponse;
import com.example.accounts.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accounts")
@RequiredArgsConstructor
public class AccountsController {
    private final AccountsService accountsService;

    @GetMapping("customers/{id}")
    public List<AccountsResponse> getAccountsByCustomer(@PathVariable Long id) {
        return accountsService.getAccountsByCustomer(id);
    }
}
