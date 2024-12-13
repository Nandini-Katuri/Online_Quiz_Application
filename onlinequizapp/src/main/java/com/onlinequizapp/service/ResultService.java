package com.onlinequizapp.service;

import com.onlinequizapp.entity.Result;
import com.onlinequizapp.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultService {

    private final ResultRepository resultRepository;

    @Autowired
    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public Result saveResult(Result result) {
        // Logic to save quiz result
        return resultRepository.save(result);
    }

    public List<Result> getResultsByUserId(Long userId) {
        return resultRepository.findByUserId(userId);
    }

    public List<Result> getResultsByQuizId(Long quizId) {
        return resultRepository.findByQuizId(quizId);
    }

    public Optional<Result> getResultById(Long id) {
        return resultRepository.findById(id);
    }
}
