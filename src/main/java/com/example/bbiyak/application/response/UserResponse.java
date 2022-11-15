package com.example.bbiyak.application.response;

import com.example.bbiyak.domain.model.dto.GetUserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class UserResponse {
    private final List<GetUserDto> users;
}
