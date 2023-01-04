package com.example.bbiyak.domain.exception.auth;

public class AccountExpiredException extends RuntimeException{
    public AccountExpiredException() {
        super("계정이 만료되었습니다.");
    }
}
