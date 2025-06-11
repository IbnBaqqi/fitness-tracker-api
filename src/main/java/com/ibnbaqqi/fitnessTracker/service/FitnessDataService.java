package com.ibnbaqqi.fitnessTracker.service;

import com.ibnbaqqi.fitnessTracker.domain.FitnessData;
import com.ibnbaqqi.fitnessTracker.dto.FitnessDataDto;
import com.ibnbaqqi.fitnessTracker.dto.CreateFitnessDataRequest;
import com.ibnbaqqi.fitnessTracker.repositories.FitnessDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FitnessDataService {

    FitnessDataRepository trackerRepository;

    public void createTracker(CreateFitnessDataRequest request) {

        if ( request == null ) {
            return;
        }

        var track = new FitnessData();

        track.setUsername(request.getUsername());
        track.setActivity(request.getActivity());
        track.setDuration(request.getDuration());
        track.setCalories(request.getCalories());

        trackerRepository.save(track);
    }

    public List<FitnessDataDto> getTracker() {
        return trackerRepository.findAll(Sort.by(Sort.Direction.DESC, "username")
                        .and(Sort.by(Sort.Direction.DESC, "activity"))).stream()
                .map(tracker -> new FitnessDataDto(
                        tracker.getId(),
                        tracker.getUsername(),
                        tracker.getActivity(),
                        tracker.getDuration(),
                        tracker.getCalories()))
                .toList();
    }
}
