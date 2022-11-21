package com.example.bbiyak.domain.service;

import com.example.bbiyak.application.request.UpdateUserRequest;
import com.example.bbiyak.application.request.UserRequest;
import com.example.bbiyak.domain.exception.UserNotFoundException;
import com.example.bbiyak.domain.model.dto.GetUserDto;
import com.example.bbiyak.domain.model.entity.User;
import com.example.bbiyak.domain.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<GetUserDto> getUsers() {
        return userRepository.findAll().stream()
                .map(GetUserDto::new)
                .collect(Collectors.toList());
    }

    public void insertUser(UserRequest userRequest) {
        userRepository.save(new User(userRequest.getUserId(), userRequest.getUserPw(), userRequest.getUserName(), userRequest.getUserPhone()));
    }

    public void updateUser(UpdateUserRequest updateUserRequest) {
        User user = userRepository.findById(updateUserRequest.getUserNo()).orElseThrow(UserNotFoundException::new);
        user.setUserName(updateUserRequest.getUserName());
        user.setUserPw(updateUserRequest.getUserPw());
        user.setUserPhone(updateUserRequest.getUserPhone());
        userRepository.save(user);
    }
}
