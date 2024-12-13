package com.onlinequizapp.service;

import com.onlinequizapp.entity.Quiz;
import com.onlinequizapp.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public Quiz createOrUpdateQuiz(Quiz quiz) {
        // Logic to create or update a quiz
        return quizRepository.save(quiz);
    }

    public Optional<Quiz> getQuizById(Long id) {
        return quizRepository.findById(id);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public void deleteQuiz(Long id) {
        quizRepository.deleteById(id);
    }

    public List<Quiz> searchQuizzesByTitle(String title) {
        return quizRepository.findByTitleContainingIgnoreCase(title);
    }
}
