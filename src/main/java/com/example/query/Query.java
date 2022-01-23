package com.example.query;

import com.example.entity.Card;
import com.example.response.CardResponse;
import com.example.service.CardService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired //example of dependency injection
    //using card service will call method to get the card by id
    CardService cardService;

    public CardResponse card (int id){
        System.out.println("Here");
        return new CardResponse(cardService.getCardById(id));
    }

    public List<Card> findAllCards() {
        return cardService.getCards();
    }

}
