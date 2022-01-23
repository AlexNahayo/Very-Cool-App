package com.example.mutation;

import com.example.request.CreateCardRequest;
import com.example.response.CardResponse;
import com.example.service.CardService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//Mutation Resolved to add a new card in the data, can also add other operation such as Update, Delete in the future.
public class Mutation implements GraphQLMutationResolver {

   @Autowired
   CardService cardService;

   public CardResponse createCard (CreateCardRequest createCardRequest) {
         //this will return the object that the consumer just created in the response
      return new CardResponse(cardService.createCard(createCardRequest));
   }
}
