package com.example.bbiyak.application.response;

import com.example.bbiyak.domain.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserSignInResponse {
    private User user;
}
