package com.ibnbaqqi.fitnessTracker.controller;

import com.ibnbaqqi.fitnessTracker.dto.createTrackerRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TrackerController {

    @PostMapping("/tracker")
    public ResponseEntity<?> createTrack(@RequestBody createTrackerRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/tracker")
    public ResponseEntity<?> getTrack() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
