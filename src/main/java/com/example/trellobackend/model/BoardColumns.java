package com.example.trellobackend.model;

import org.springframework.data.annotation.Id;

public record BoardColumns(@Id Integer id, String name, Integer reference) {

}
