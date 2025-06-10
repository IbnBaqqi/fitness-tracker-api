package com.ibnbaqqi.fitnessTracker.controller;

import com.ibnbaqqi.fitnessTracker.dto.TrackerDto;
import com.ibnbaqqi.fitnessTracker.dto.CreateTrackerRequest;
import com.ibnbaqqi.fitnessTracker.service.TrackerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrackerController {

    private final TrackerService trackerService;

    public TrackerController(TrackerService trackerService) {
        this.trackerService = trackerService;
    }

    @PostMapping("/tracker")
    public ResponseEntity<?> createTrack(@RequestBody CreateTrackerRequest request) {
        trackerService.createTracker(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/tracker")
    public List<TrackerDto> getTrack() {
        return trackerService.getTracker();
    }
}
