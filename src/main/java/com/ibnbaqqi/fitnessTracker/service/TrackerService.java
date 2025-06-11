package com.ibnbaqqi.fitnessTracker.service;

import com.ibnbaqqi.fitnessTracker.domain.Tracker;
import com.ibnbaqqi.fitnessTracker.dto.TrackerDto;
import com.ibnbaqqi.fitnessTracker.dto.CreateTrackerRequest;
import com.ibnbaqqi.fitnessTracker.repositories.TrackerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrackerService {

    TrackerRepository trackerRepository;

    public void createTracker(CreateTrackerRequest request) {

        if ( request == null ) {
            return;
        }

        var track = new Tracker();

        track.setUsername(request.getUsername());
        track.setActivity(request.getActivity());
        track.setDuration(request.getDuration());
        track.setCalories(request.getCalories());

        trackerRepository.save(track);
    }

    public List<TrackerDto> getTracker() {
        return trackerRepository.findAll(Sort.by(Sort.Direction.DESC, "username")
                        .and(Sort.by(Sort.Direction.DESC, "activity"))).stream()
                .map(tracker -> new TrackerDto(
                        tracker.getId(),
                        tracker.getUsername(),
                        tracker.getActivity(),
                        tracker.getDuration(),
                        tracker.getCalories()))
                .toList();
    }
}
