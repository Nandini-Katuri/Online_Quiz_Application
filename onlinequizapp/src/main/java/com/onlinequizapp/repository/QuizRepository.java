package com.onlinequizapp.repository;

import com.onlinequizapp.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    // Custom query to find quizzes by title
    List<Quiz> findByTitleContainingIgnoreCase(String title);
}
