package com.example.cards.service;

import com.example.cards.dto.response.CardsResponse;
import com.example.cards.entity.CardsEntity;
import com.example.cards.mapper.CardsMapper;
import com.example.cards.respoitory.CardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardsService {
    private final CardsRepository cardsRepository;

    public List<CardsResponse> getCardsByCustomer(Long customerId) {
        return cardsRepository.getCardsEntitiesByCustomerId(customerId)
                .orElseThrow(() -> new RuntimeException(
                        "Queried object doesn't exist with id, " + customerId))
                .stream()
                .map(CardsMapper::toResponse).toList();
    }
}
