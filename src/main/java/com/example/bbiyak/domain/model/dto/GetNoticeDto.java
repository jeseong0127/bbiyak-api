package com.example.bbiyak.domain.model.dto;

import com.example.bbiyak.domain.model.entity.Board;
import com.example.bbiyak.domain.model.enums.BoardType;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class GetNoticeDto {
    private final int boardId;
    private final BoardType boardType;
    private final String title;
    private final String content;
    private final Character useYn;
    private final String regId;
    private final LocalDateTime regDate;
    private final String updId;
    private final LocalDateTime updDate;
    private final String delId;
    private final LocalDateTime delDate;

    public GetNoticeDto(Board board) {
        this.boardId = board.getBoardId();
        this.boardType = board.getBoardType();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.useYn = board.getUseYn();
        this.regId = board.getRegId();
        this.regDate = board.getRegDate();
        this.updId = board.getUpdId();
        this.updDate = board.getUpdDate();
        this.delId = board.getDelId();
        this.delDate = board.getDelDate();
    }
}
