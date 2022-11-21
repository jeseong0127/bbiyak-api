package com.example.bbiyak.application.controller;

import com.example.bbiyak.application.request.UpdateUserRequest;
import com.example.bbiyak.application.request.UserRequest;
import com.example.bbiyak.application.response.UserResponse;
import com.example.bbiyak.domain.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ApiOperation("유저 정보 리스트 가져오기")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserResponse getUsers(
    ){
        return new UserResponse(userService.getUsers());
    }

    @ApiOperation("회원가입")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void insertUser(
            @RequestBody UserRequest userRequest
    ) {
        userService.insertUser(userRequest);
    }

    @ApiOperation("회원정보 수정")
    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(
            @RequestBody UpdateUserRequest updateUserRequest
    ) {
        userService.updateUser(updateUserRequest);
    }


}
