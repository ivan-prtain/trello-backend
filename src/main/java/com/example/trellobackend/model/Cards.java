package com.example.trellobackend.model;

import org.springframework.data.annotation.Id;

public record Cards(@Id Integer id, String name, String message, Integer board_column_id) {

}
