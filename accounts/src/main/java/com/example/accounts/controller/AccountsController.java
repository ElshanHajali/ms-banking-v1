package com.example.accounts.controller;

import com.example.accounts.config.AccountsCloudConfigs;
import com.example.accounts.dto.response.AccountsResponse;
import com.example.accounts.service.AccountsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accounts")
@RequiredArgsConstructor
public class AccountsController {
    private final AccountsService accountsService;
    private final AccountsCloudConfigs accountsCloudConfigs;

    @GetMapping("customers/{id}")
    public List<AccountsResponse> getAccountsByCustomer(@PathVariable Long id) {
        return accountsService.getAccountsByCustomer(id);
    }

    @GetMapping("properties")
    public AccountsCloudConfigs getPropertiesDetails() {
        return accountsCloudConfigs;
    }
}
