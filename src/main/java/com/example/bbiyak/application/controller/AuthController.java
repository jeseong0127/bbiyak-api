package com.example.bbiyak.application.controller;

import com.example.bbiyak.domain.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    /*@ApiOperation("유저 정보 가져오기")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserResponse getUser(
            @RequestBody UserRequest userRequest
            ){
        return  new UserResponse(authService.getUser(userRequest));
    }
*/


}
