package com.ipap.springboot3features.dto;

import org.springframework.http.HttpStatus;

/* Not needed for the example, just for showcase */
public record Error(
        HttpStatus httpStatus,
        int errorCode,
        String errorMessage) {
}
