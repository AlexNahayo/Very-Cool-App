package com.example.entity;

import com.example.request.CreateCardRequest;
//use lombox throughout folders to reduce boiler plate code
import lombok.*;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

//Card Class - which is set up as an Entity for the database.
public class Card {

    @Id
    @SequenceGenerator(
            name = "card_sequence",
            sequenceName = "card_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "card_sequence"
    )
    //instance/state variables
    private Integer id;
    @Column (
            nullable = false
    )
    private String title;
    @Column (
            nullable = false
    )
    private String creatorName;
    @Column (
            nullable = false
    )
    private String imageUrl;


    public Card(CreateCardRequest createCardRequest) {
        this.title = createCardRequest.getTitle();
        this.creatorName =  createCardRequest.getCreatorName();
        this.imageUrl = createCardRequest.getImageUrl();
    }
}
