package com.example.trellobackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.trellobackend.model.Board;

public interface BoardRepository extends CrudRepository<Board, Integer> {
}