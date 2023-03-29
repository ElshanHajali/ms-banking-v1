package com.example.loans.dao.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
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
    private Long number;

    private String type;

    private Long customerId;

    @CreationTimestamp
    private LocalDateTime startDt;

    private String createDt;

    private Integer totalLoan;

    private Integer amountPaid;

    private Integer outstandingAmount;

}
