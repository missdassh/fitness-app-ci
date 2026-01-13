package com.fitness;

public class App {

    public int caloriesBurned(int minutes, int intensity) {
        if (minutes <= 0) {
            throw new IllegalArgumentException("Minutes must be > 0");
        }
        if (intensity <= 0) {
            throw new IllegalArgumentException("Intensity must be > 0");
        }

        return minutes * intensity;
    }
}
