package com.example.trellobackend.controller;

import com.example.trellobackend.model.Board;
import com.example.trellobackend.repository.BoardRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
public class BoardController {

    private final BoardRepository repository;

    public BoardController(BoardRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Board> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Board findById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return repository.save(board);
    }

}