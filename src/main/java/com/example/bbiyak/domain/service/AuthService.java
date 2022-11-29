package com.example.bbiyak.domain.service;

import com.example.bbiyak.domain.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository authRepository;


}
