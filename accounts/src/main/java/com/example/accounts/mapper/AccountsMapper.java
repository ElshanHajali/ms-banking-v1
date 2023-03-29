package com.example.accounts.mapper;

import com.example.accounts.dao.entity.AccountsEntity;
import com.example.accounts.dto.response.AccountsResponse;

public class AccountsMapper {

    public static AccountsResponse toResponse(AccountsEntity account) {
        return AccountsResponse
                .builder()
                .branchAddress(account.getBranchAddress())
                .createdAt(account.getCreatedAt())
                .customerId(account.getCustomerId())
                .type(account.getType())
                .updatedAt(account.getUpdatedAt())
                .build();
    }
}
