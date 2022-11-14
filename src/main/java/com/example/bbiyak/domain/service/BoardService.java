package com.example.bbiyak.domain.service;

import com.example.bbiyak.application.request.NoticeRequest;
import com.example.bbiyak.application.request.UpdateNoticeRequest;
import com.example.bbiyak.domain.exception.BoardNotFoundException;
import com.example.bbiyak.domain.model.dto.GetNoticeDto;
import com.example.bbiyak.domain.model.entity.Board;
import com.example.bbiyak.domain.model.repository.BoardRepository;

import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<GetNoticeDto> getNotices() {
        return boardRepository.findAll().stream()
                .map(GetNoticeDto::new)
                .collect(Collectors.toList());
    }

    public void insertNotice(NoticeRequest noticeRequest) {
        boardRepository.save(new Board(noticeRequest.getTitle(), noticeRequest.getContent()));
    }

    public void updateNotice(UpdateNoticeRequest updateNoticeRequest) {
        Board board = boardRepository.findById(updateNoticeRequest.getNoticeId()).orElseThrow(BoardNotFoundException::new);
        board.setTitle(updateNoticeRequest.getTitle());
        board.setContent(updateNoticeRequest.getContent());
        boardRepository.save(board);
    }

    public void deleteNotice(int noticeId) {
        boardRepository.deleteById(noticeId);
    }
}
