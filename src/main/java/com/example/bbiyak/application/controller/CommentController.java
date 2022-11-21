package com.example.bbiyak.application.controller;

import com.example.bbiyak.application.request.CommentRequest;
import com.example.bbiyak.application.request.UpdateCommentRequest;
import com.example.bbiyak.application.request.UpdateNoticeRequest;
import com.example.bbiyak.domain.service.CommentService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @ApiOperation("댓글 등록")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void insertComment(
           // 내용 파라미터로 받아야 함. 한번에 받기 위해서?
           @RequestBody CommentRequest commentRequest
    ){
        commentService.insertComment(commentRequest);
    }

    @ApiOperation("댓글 수정")
    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public void updateComment(
            @RequestBody UpdateCommentRequest updateCommentRequest
            ){
        commentService.updateComment(updateCommentRequest);
    }

    @ApiOperation("댓글 삭제하기")
    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public void deleteComment(
            @RequestParam int commentNo
    ){
        commentService.deleteComment(commentNo);
    }

}
