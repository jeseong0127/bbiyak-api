package com.example.bbiyak.domain.exception;

public class BoardNotFoundException extends RuntimeException{
    public BoardNotFoundException(){
        super("해당하는 게시글이 없습니다.");
    }
}
