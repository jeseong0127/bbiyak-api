package com.example.bbiyak.domain.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userNo;

    private String userId;

    private String userPw;

    private String userName;

    private String userPhone;

    private char userYn;

    private LocalDateTime userRegDate;

    private LocalDateTime userUpdDate;

    private LocalDateTime userDelDate;

    public User(String userId, String userPw, String userName, String userPhone) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userRegDate = LocalDateTime.now();
        this.userYn = 'Y';
    }
}
