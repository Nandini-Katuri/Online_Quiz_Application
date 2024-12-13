package com.onlinequizapp.controller;

import com.onlinequizapp.service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leaderboard")
public class LeaderboardController {

    @Autowired
    private LeaderboardService leaderboardService;

    @GetMapping
    public ResponseEntity<List<String>> getLeaderboard() {
        List<String> leaderboard = leaderboardService.getLeaderboard();
        return ResponseEntity.ok(leaderboard);
    }
}
