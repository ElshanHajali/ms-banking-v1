package com.example.accounts.service;

import com.example.accounts.dao.repository.AccountsRepository;
import com.example.accounts.dto.response.AccountsResponse;
import com.example.accounts.mapper.AccountsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountsService {
    private final AccountsRepository accountsRepository;

    public List<AccountsResponse> getAccountsByCustomer(Long id) {

              return   accountsRepository.findAccountsEntitiesByCustomerId(id)
                        .orElseThrow(() -> new RuntimeException(
                                "Queried object doesn't exist with id, "+id
                        )).stream().map(AccountsMapper::toResponse).toList();
    }
}
