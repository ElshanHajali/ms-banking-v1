package com.example.accounts.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccountsResponse {

    private String type;
    private String branchAddress;
    private Long customerId;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;

}
