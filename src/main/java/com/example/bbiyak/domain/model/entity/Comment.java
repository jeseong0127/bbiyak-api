package com.example.bbiyak.domain.model.entity;

import com.example.bbiyak.application.request.CommentRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentNo;

    private int userNo;

    private String commentContent;

    private int movieNo;

    private double rating;

    public Comment(CommentRequest commentRequest) {
        this.commentContent = commentRequest.getCommentContent();
        this.movieNo = commentRequest.getMovieNo();
        this.rating = commentRequest.getRating();
    }
}
