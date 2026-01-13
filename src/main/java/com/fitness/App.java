package com.fitness;

public class App {
    public static void main(String[] args) {
        System.out.println("Fitness App skeleton");
    }

    // Пример "логики" для теста
    public static int caloriesBurned(int minutes, int caloriesPerMinute) {
        if (minutes < 0 || caloriesPerMinute < 0) {
            throw new IllegalArgumentException("Values must be non-negative");
        }
        return minutes * caloriesPerMinute;
    }
}
