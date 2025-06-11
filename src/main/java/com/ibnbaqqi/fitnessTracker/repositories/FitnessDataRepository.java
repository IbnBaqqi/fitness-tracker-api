package com.ibnbaqqi.fitnessTracker.repositories;

import com.ibnbaqqi.fitnessTracker.domain.FitnessData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessDataRepository extends JpaRepository<FitnessData, Long> {
}
