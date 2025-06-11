package com.ibnbaqqi.fitnessTracker.dto;

import lombok.Data;

@Data
public class CreateFitnessDataRequest {

    private String username;
    private String activity;
    private int duration;
    private int calories;

}
