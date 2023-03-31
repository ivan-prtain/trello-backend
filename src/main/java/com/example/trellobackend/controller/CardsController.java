package com.example.trellobackend.controller;

import com.example.trellobackend.model.Cards;
import com.example.trellobackend.repository.CardsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardsController {

    private final CardsRepository repository;

    public CardsController(CardsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public List<Cards> findById(@PathVariable int id) {
        return repository.findByReference(id);
    }
}