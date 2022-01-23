package com.example.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//Class CreateCardRequest - is for the consumer of the API
public class CreateCardRequest {

    private String title;

    private String creatorName;

    private String imageUrl;

}
