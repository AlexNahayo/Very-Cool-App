package com.example.response;

import com.example.entity.Card;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
//Class CreateCardResponse- is for response the consumer of the API
public class CardResponse {

    private int id;
    private String title;
    private String creatorName;
    private String imageUrl;

public CardResponse (Card card){
    this.id = card.getId();
    this.title = card.getTitle();
    this.creatorName = card.getCreatorName();
    this.imageUrl = card.getImageUrl();

    }
}
