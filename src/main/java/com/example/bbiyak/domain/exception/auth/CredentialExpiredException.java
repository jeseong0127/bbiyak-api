package com.example.bbiyak.domain.exception.auth;

public class CredentialExpiredException extends RuntimeException{
    public CredentialExpiredException() {
        super("비밀번호가 만료되었습니다. 비밀번호를 재설정해주세요");
    }
}
