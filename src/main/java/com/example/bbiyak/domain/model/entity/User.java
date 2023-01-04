package com.example.bbiyak.domain.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    private String userRole;

    private char userYn;

    private LocalDateTime userRegDate;

    private LocalDateTime userUpdDate;

    private LocalDateTime userDelDate;

    public User(String userId, String userPw, String userName, String userPhone, String userRole) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userRole = userRole;
        this.userRegDate = LocalDateTime.now();
        this.userYn = 'Y';
    }

    // ENUM으로 안하고 ,로 해서 구분해서 ROLE을 입력 -> 그걸 파싱!!
    public List<String> getRoleList(){
        if(this.userRole.length() > 0){
            return Arrays.asList(this.userRole.split(","));
        }
        return new ArrayList<>();
    }
}
