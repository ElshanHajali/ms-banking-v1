package com.example.loans.dao.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "loans")
public class LoansEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Long customerId;

    @CreationTimestamp
    private LocalDateTime createDt;

    private BigDecimal totalLoan;

    private BigDecimal amountPaid;

    private BigDecimal outstandingAmount;

    @CreationTimestamp
    private LocalDateTime startDt;

}
