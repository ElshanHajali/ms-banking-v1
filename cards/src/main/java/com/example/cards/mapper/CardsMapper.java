package com.example.cards.mapper;

import com.example.cards.dto.response.CardsResponse;
import com.example.cards.entity.CardsEntity;

public interface CardsMapper {
    static CardsResponse toResponse(CardsEntity card) {
        return CardsResponse.builder()
                .amountUsed(card.getAmountUsed())
                .availableAmount(card.getAvailableAmount())
                .createdAt(card.getCreatedAt())
                .customerId(card.getCustomerId())
                .number(card.getNumber())
                .totalLimit(card.getTotalLimit())
                .type(card.getType())
                .build();
    }
}
