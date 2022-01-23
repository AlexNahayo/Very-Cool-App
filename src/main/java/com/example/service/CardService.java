package com.example.service;

import com.example.entity.Card;
import com.example.repository.CardRepository;
import com.example.request.CreateCardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public Card getCardById (int id) {
        return cardRepository.findById(id).get();
    }

    public List<Card> getCards (){
        return cardRepository.findAll();
    }

    public Card createCard (CreateCardRequest createCardRequest){
        Card card = new Card(createCardRequest);
        return cardRepository.save(card);
    }


}
