package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AgeNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleAgeException(AgeNotFoundException ex) {

        return ex.getMessage();
    }
}
