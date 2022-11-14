package com.example.bbiyak.domain.model.repository;

import com.example.bbiyak.domain.model.entity.Board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
