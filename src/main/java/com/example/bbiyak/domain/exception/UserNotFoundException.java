package com.example.bbiyak.domain.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("가입된 회원정보가 존재하지 않습니다.");
    }
}
