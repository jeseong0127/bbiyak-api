package com.example.bbiyak.application.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UpdateUserRequest {
    @NotNull
    private int userNo;

    private String userPw;

    private String userName;

    private String userPhone;
}
