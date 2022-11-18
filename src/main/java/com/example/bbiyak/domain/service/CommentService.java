package com.example.bbiyak.domain.service;

import com.example.bbiyak.application.request.CommentRequest;
import com.example.bbiyak.domain.model.entity.Comment;
import com.example.bbiyak.domain.model.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void insertComment(CommentRequest commentRequest){
        commentRepository.save(new Comment(commentRequest));
    }
}
