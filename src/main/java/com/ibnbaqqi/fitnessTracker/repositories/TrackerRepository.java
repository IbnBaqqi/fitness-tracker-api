package com.ibnbaqqi.fitnessTracker.repositories;

import com.ibnbaqqi.fitnessTracker.domain.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackerRepository extends JpaRepository<Tracker, Long> {
}
