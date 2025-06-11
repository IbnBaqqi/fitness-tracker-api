package com.ibnbaqqi.fitnessTracker.controller;

import com.ibnbaqqi.fitnessTracker.dto.FitnessDataDto;
import com.ibnbaqqi.fitnessTracker.dto.CreateFitnessDataRequest;
import com.ibnbaqqi.fitnessTracker.service.FitnessDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FitnessDataController {

    private final FitnessDataService trackerService;

    public FitnessDataController(FitnessDataService trackerService) {
        this.trackerService = trackerService;
    }

    @PostMapping("/tracker")
    public ResponseEntity<?> createTrack(@RequestBody CreateFitnessDataRequest request) {
        trackerService.createTracker(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/tracker")
    public List<FitnessDataDto> getTrack() {
        return trackerService.getTracker();
    }
}
