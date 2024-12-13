package com.onlinequizapp.repository;

import com.onlinequizapp.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    // Custom query to find results by user ID
    List<Result> findByUserId(Long userId);
    
    // Custom query to find results by quiz ID
    List<Result> findByQuizId(Long quizId);
}
