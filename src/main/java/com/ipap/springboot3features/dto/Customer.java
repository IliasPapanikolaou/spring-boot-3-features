package com.ipap.springboot3features.dto;

public record Customer(
        int id,
        String name,
        String email,
        String gender
) {
}
