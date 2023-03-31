package com.example.trellobackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.trellobackend.model.BoardColumns;

public interface BoardColumnsRepository extends CrudRepository<BoardColumns, Integer> {
    List<BoardColumns> findByReference(int reference);
}