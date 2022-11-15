package com.example.bbiyak.domain.model.dto;

import com.example.bbiyak.domain.model.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetUserDto {
    private final int userNo;
    private final String userId;
    private final String userPw;
    private final String userName;
    private final String userPhone;
    private final char userYn;
    private final LocalDateTime userRegDate;
    private final LocalDateTime userUpdDate;
    private final LocalDateTime userDelDate;

    public GetUserDto(User user){
         this.userNo = user.getUserNo();
         this.userId = user.getUserId();
         this.userPw = user.getUserPw();
         this.userName = user.getUserName();
         this.userPhone = user.getUserPhone();
         this.userYn = user.getUserYn();
         this.userRegDate = user.getUserRegDate();
         this.userUpdDate = user.getUserUpdDate();
         this.userDelDate = user.getUserDelDate();
    }

}
