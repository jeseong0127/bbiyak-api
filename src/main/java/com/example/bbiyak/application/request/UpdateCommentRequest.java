package com.example.bbiyak.application.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@AllArgsConstructor
@Data
public class UpdateCommentRequest {
    private String commentContent;

    private double rating;

    @NonNull
    private int commentNo;


}
