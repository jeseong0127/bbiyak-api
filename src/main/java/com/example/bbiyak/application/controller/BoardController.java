package com.example.bbiyak.application.controller;

import com.example.bbiyak.application.request.NoticeRequest;
import com.example.bbiyak.application.request.UpdateNoticeRequest;
import com.example.bbiyak.application.response.NoticeResponse;
import com.example.bbiyak.domain.service.BoardService;
import io.swagger.annotations.ApiOperation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @ApiOperation("공지사항 리스트 가져오기")
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public NoticeResponse getNotices(
    ) {
        return new NoticeResponse(boardService.getNotices());
    }

    @ApiOperation("공지사항 만들기")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void insertNotice(
            @RequestBody NoticeRequest noticeRequest
    ) {
        boardService.insertNotice(noticeRequest);
    }

    @ApiOperation("공지사항 수정하기")
    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public void updateNotice(
            @RequestBody UpdateNoticeRequest updateNoticeRequest
    ) {
        boardService.updateNotice(updateNoticeRequest);
    }

    @ApiOperation("공지사항 삭제하기")
    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public void deleteNotice(
            @RequestParam int noticeId
    ) {
        boardService.deleteNotice(noticeId);
    }

}
