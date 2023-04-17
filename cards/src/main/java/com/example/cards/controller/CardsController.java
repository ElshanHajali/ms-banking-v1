package com.example.cards.controller;

import com.example.cards.dto.response.CardsResponse;
import com.example.cards.service.CardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class CardsController {
    private final CardsService cardsService;

    @GetMapping("customers/{id}")
    public List<CardsResponse> getCardsByCustomer(@PathVariable("id") Long customerId) {
        return cardsService.getCardsByCustomer(customerId);
    }

}
