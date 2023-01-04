package com.example.bbiyak.application.exception;

import com.example.bbiyak.core.response.ErrorResponse;
import com.example.bbiyak.domain.exception.auth.AccountExpiredException;
import com.example.bbiyak.domain.exception.auth.BadCredentialsException;
import com.example.bbiyak.domain.exception.auth.CredentialExpiredException;
import com.example.bbiyak.domain.exception.auth.AccountDisabledException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AuthFailureHandler {

    //비밀번호 불일치
    @ExceptionHandler(BadCredentialsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleBadCredentials(BadCredentialsException exception) {
        return new ErrorResponse(HttpStatus.NOT_FOUND, "Auth-001", exception.getMessage());
    }

    //계정 만료
    @ExceptionHandler(AccountExpiredException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleAccountExpired(AccountExpiredException exception) {
        return new ErrorResponse(HttpStatus.NOT_FOUND, "Auth-002", exception.getMessage());
    }

    //계정비활성화 만료
    @ExceptionHandler(AccountDisabledException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleAccountDisabled(AccountDisabledException exception) {
        return new ErrorResponse(HttpStatus.NOT_FOUND, "Auth-003", exception.getMessage());
    }

    //비밀번호 만료
    @ExceptionHandler(CredentialExpiredException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleCredentialExpired(CredentialExpiredException exception) {
        return new ErrorResponse(HttpStatus.NOT_FOUND, "Auth-004", exception.getMessage());
    }


}
