package com.example.bbiyak.domain.model.repository;

import com.example.bbiyak.domain.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
