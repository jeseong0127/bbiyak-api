package com.example.bbiyak.application.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserRequest {
    @NonNull
    private String userId;

    @NonNull
    private String userPw;

    @NonNull
    private String userName;

    @NonNull
    private String userPhone;

}
