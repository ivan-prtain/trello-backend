package com.example.trellobackend.controller;

import com.example.trellobackend.model.Cards;
import com.example.trellobackend.repository.CardsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardsController {

    private final CardsRepository repository;

    public CardsController(CardsRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Cards> findAll() {
        return repository.findAll();
    }
}