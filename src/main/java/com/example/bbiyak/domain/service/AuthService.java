package com.example.bbiyak.domain.service;

import com.example.bbiyak.domain.exception.auth.BadCredentialsException;
import com.example.bbiyak.domain.exception.user.UserNotFoundException;
import com.example.bbiyak.domain.model.entity.User;
import com.example.bbiyak.domain.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signIn(String userId, String userPw) {
        User user = userRepository.findByUserId(userId)
                .orElseThrow(UserNotFoundException::new);

        boolean result = passwordEncoder.matches(userPw, user.getUserPw());
        if (!result) throw new BadCredentialsException();

        return user ;
    }
}
