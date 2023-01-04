package com.example.bbiyak.domain.model.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String userId;
    private String userPw;
}
