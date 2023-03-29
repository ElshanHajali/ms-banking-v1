package com.example.loans.dao.repository;

import com.example.loans.dao.entity.LoansEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoansRepository extends JpaRepository<LoansEntity, Long> {

    Optional<List<LoansEntity>> findLoansEntitiesByCustomerIdOrderByStartDtDesc(Long customerId);
}
