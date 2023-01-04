package com.example.bbiyak.domain.exception.auth;

public class AccountDisabledException extends RuntimeException{
    public AccountDisabledException(){
        super("비활성화 된 계정입니다.");
    }

}
