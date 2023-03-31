package com.example.trellobackend.controller;

import com.example.trellobackend.model.BoardColumns;
import com.example.trellobackend.repository.BoardColumnsRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/board-columns")
public class BoardColumnsController {

    private final BoardColumnsRepository repository;

    public BoardColumnsController(BoardColumnsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public List<BoardColumns> findById(@PathVariable int id) {
        return repository.findByReference(id);
    }

    @PostMapping
    public BoardColumns createBoard(@RequestBody BoardColumns BoardColumns) {
        return repository.save(BoardColumns);
    }
}