package com.ibnbaqqi.fitnessTracker.dto;

import lombok.Data;

@Data
public class createTrackerRequest {

    private String username;
    private String activity;
    private int duration;
    private int calories;

}
