package com.example.repository;

import com.example.entity.Card;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CardRepositoryTest {

    @Autowired
    private CardRepository cardRepository;

    @Test
    public void saveCard() {
        Card card = Card.builder()
                .title("Nice Picture")
                .creatorName("Alex Nahayo")
                .imageUrl("www.test.com")
                .build();
        cardRepository.save(card);
    }

}