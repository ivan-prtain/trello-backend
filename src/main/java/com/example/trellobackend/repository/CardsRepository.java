package com.example.trellobackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.trellobackend.model.Cards;

public interface CardsRepository extends CrudRepository<Cards, Integer> {
}