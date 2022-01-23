package com.example.repository;


import com.example.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This Interface will allow us to implement different method for database interaction this uses Spring Data JPA.
@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

}
