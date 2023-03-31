package com.example.trellobackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.trellobackend.model.Cards;

import java.util.List;

public interface CardsRepository extends CrudRepository<Cards, Integer> {
    List<Cards> findByReference(int reference);

}