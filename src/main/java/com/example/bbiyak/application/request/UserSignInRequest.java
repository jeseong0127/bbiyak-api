package com.example.bbiyak.application.request;

import lombok.Generated;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserSignInRequest {
    @NonNull
    private String userId;

    @NonNull
    private String userPw;

}
