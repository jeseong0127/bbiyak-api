package com.example.bbiyak.application.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class NoticeRequest {
    @NonNull
    private String title;

    @NonNull
    private String content;
}
