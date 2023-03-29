package com.example.accounts.dao.repository;

import com.example.accounts.dao.entity.AccountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountsRepository extends JpaRepository<AccountsEntity, Long> {
    Optional<List<AccountsEntity>> findAccountsEntitiesByCustomerId(Long id);
}
