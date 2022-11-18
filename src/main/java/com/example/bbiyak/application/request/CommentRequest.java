package com.example.bbiyak.application.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CommentRequest {
    @NonNull
    private String commentContent;

    @NonNull
    private double rating;

    @NonNull
    private int movieNo;

}
