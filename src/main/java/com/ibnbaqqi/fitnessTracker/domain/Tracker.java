package com.ibnbaqqi.fitnessTracker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tracker")
public class Tracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String activity;

    @Column(nullable = false)
    private int duration;

    @Column(nullable = false)
    private int calories;
}
