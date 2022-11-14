package com.example.bbiyak.application.response;

import com.example.bbiyak.domain.model.dto.GetNoticeDto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NoticeResponse {
    private final List<GetNoticeDto> notices;
}
