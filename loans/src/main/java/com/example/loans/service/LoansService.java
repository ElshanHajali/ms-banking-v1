package com.example.loans.service;

import com.example.loans.dao.repository.LoansRepository;
import com.example.loans.dto.LoansResponse;
import com.example.loans.mapper.LoansMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoansService {
    private final LoansRepository loansRepository;

    public List<LoansResponse> getLoansByCustomerId(Long customerId) {
        return loansRepository.findLoansEntitiesByCustomerIdOrderByStartDtDesc(customerId).orElseThrow(() -> new RuntimeException(
                "Queried object doesn't exist with id, "+customerId
        )).stream().map(LoansMapper::toResponse).toList();
    }
}
