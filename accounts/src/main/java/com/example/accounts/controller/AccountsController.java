package com.example.accounts.controller;

import com.example.accounts.config.AccountsCloudConfigs;
import com.example.accounts.dto.response.AccountsResponse;
import com.example.accounts.dto.response.PropertyResponse;
import com.example.accounts.service.AccountsService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
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
    public PropertyResponse getPropertiesDetails() {
        return PropertyResponse.builder()
                .mailDetails(accountsCloudConfigs.getMailDetails())
                .activeBranches(accountsCloudConfigs.getActiveBranches())
                .buildVersion(accountsCloudConfigs.getBuildVersion())
                .msg(accountsCloudConfigs.getMsg()).build();
    }
}
