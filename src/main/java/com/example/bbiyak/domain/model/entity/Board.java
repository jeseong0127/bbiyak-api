package com.example.bbiyak.domain.model.entity;

import com.example.bbiyak.domain.model.enums.BoardType;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardId;

    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    private String title;

    private String content;

    private char useYn;

    private String regId;

    private LocalDateTime regDate;

    private String updId;

    private LocalDateTime updDate;

    private String delId;

    private LocalDateTime delDate;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
