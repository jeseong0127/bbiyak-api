package com.example.bbiyak.application.request;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UpdateNoticeRequest {
    @NotNull
    private int noticeId;

    private String title;

    private String content;
}
