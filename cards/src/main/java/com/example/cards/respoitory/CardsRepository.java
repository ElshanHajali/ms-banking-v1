package com.example.cards.respoitory;

import com.example.cards.entity.CardsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CardsRepository extends JpaRepository<CardsEntity, Long> {

    Optional<List<CardsEntity>> getCardsEntitiesByCustomerId(Long customerId);
}
