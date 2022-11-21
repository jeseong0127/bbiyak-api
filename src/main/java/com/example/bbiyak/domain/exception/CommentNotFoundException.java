package com.example.bbiyak.domain.exception;

import com.example.bbiyak.domain.model.entity.Board;

public class CommentNotFoundException extends RuntimeException{
    
    public CommentNotFoundException(){super("해당하는 댓글이 없습니다.");}
}
