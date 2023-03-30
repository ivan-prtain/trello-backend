package com.example.trellobackend.model;

import org.springframework.data.annotation.Id;

public record Board(@Id Integer id, String name) {

}
