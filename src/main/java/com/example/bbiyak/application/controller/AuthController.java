package com.example.bbiyak.application.controller;

import com.example.bbiyak.application.request.UserRequest;
import com.example.bbiyak.application.request.UserSignInRequest;
import com.example.bbiyak.application.response.UserResponse;
import com.example.bbiyak.application.response.UserSignInResponse;
import com.example.bbiyak.domain.service.AuthService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @ApiOperation("로그인")
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public UserSignInResponse getUser(
            @RequestBody UserSignInRequest userSignInRequest
    ){
        return new UserSignInResponse(authService.signIn(userSignInRequest.getUserId(), userSignInRequest.getUserPw()));
    }

    /*
    @ApiOperation("유저 정보 가져오기")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserResponse getUser(
            @RequestBody UserRequest userRequest
            ){
        return  new UserResponse(authService.getUser(userRequest));
    }

*/



}
