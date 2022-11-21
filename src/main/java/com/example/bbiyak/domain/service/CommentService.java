package com.example.bbiyak.domain.service;

import com.example.bbiyak.application.request.CommentRequest;
import com.example.bbiyak.application.request.UpdateCommentRequest;
import com.example.bbiyak.application.request.UpdateNoticeRequest;
import com.example.bbiyak.domain.exception.CommentNotFoundException;
import com.example.bbiyak.domain.model.entity.Comment;
import com.example.bbiyak.domain.model.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void insertComment(CommentRequest commentRequest){
        commentRepository.save(new Comment(commentRequest));
    }

    public void updateComment(UpdateCommentRequest updateCommentRequest){
            Comment comment = commentRepository.findById(updateCommentRequest.getCommentNo()).orElseThrow(CommentNotFoundException::new);
            comment.setCommentContent(updateCommentRequest.getCommentContent());
            comment.setRating(updateCommentRequest.getRating());
            commentRepository.save(comment);
    }
}
