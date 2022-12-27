package com.ipap.springboot3features.advice;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail onException(RuntimeException ex) {
        var problemDetail = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(400), ex.getMessage());
        problemDetail.setTitle("Bad Request");
        problemDetail.setDetail("Customer not found");
        return problemDetail;
    }
}
