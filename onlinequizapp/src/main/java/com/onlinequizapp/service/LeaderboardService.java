package com.onlinequizapp.service;

import com.onlinequizapp.entity.Result;
import com.onlinequizapp.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeaderboardService {

    private final ResultRepository resultRepository;

    @Autowired
    public LeaderboardService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public List<Result> getTopScores() {
        List<Result> allResults = resultRepository.findAll();
        // Assuming a higher score is better and we need to sort by score in descending order
        return allResults.stream()
                .sorted((r1, r2) -> Integer.compare(r2.getScore(), r1.getScore()))
                .limit(10) // Returns top 10 scores
                .collect(Collectors.toList());
    }
}
