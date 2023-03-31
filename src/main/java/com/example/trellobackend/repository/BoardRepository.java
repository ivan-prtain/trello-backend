package com.example.trellobackend.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.trellobackend.model.Board;

public interface BoardRepository extends CrudRepository<Board, Integer> {

    Optional<Board> findById(Long id);
}