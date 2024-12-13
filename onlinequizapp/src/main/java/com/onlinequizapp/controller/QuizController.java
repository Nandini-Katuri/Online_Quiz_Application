package com.onlinequizapp.controller;

import com.onlinequizapp.dto.QuizRequest;
import com.onlinequizapp.dto.QuizResponse;
import com.onlinequizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public ResponseEntity<String> createQuiz(@RequestBody QuizRequest quizRequest) {
        String response = quizService.createQuiz(quizRequest);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{quizId}")
    public ResponseEntity<String> updateQuiz(@PathVariable Long quizId, @RequestBody QuizRequest quizRequest) {
        String response = quizService.updateQuiz(quizId, quizRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<QuizResponse>> getAllQuizzes() {
        List<QuizResponse> quizzes = quizService.getAllQuizzes();
        return ResponseEntity.ok(quizzes);
    }

    @DeleteMapping("/{quizId}")
    public ResponseEntity<String> deleteQuiz(@PathVariable Long quizId) {
        String response = quizService.deleteQuiz(quizId);
        return ResponseEntity.ok(response);
    }
}
