package com.example.bbiyak.application.exception;

import com.example.bbiyak.core.response.ErrorResponse;
import com.example.bbiyak.domain.exception.BoardNotFoundException;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class BoardExceptionHandler {
    @ExceptionHandler(BoardNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleBoardNotFound(BoardNotFoundException exception) {
        return new ErrorResponse(HttpStatus.NOT_FOUND, "Board-001", exception.getMessage());
    }
}
