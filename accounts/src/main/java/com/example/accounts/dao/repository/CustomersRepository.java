package com.example.accounts.dao.repository;

import com.example.accounts.dao.entity.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<CustomersEntity, Long> {
}
