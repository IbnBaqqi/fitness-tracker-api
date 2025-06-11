package com.ibnbaqqi.fitnessTracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FitnessDataDto {

    private Long id;
    private String username;
    private String activity;
    private int duration;
    private int calories;

}
