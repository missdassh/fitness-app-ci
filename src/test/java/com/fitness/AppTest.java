package com.fitness;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCaloriesBurnedBasic() {
        App app = new App();

        int result = app.caloriesBurned(30, 8);

        assertEquals(240, result);
    }

    @Test
    public void testCaloriesBurnedOneMinute() {
        App app = new App();

        int result = app.caloriesBurned(1, 5);

        assertEquals(5, result);
    }

    @Test
    public void testCaloriesBurnedLargeValues() {
        App app = new App();

        int result = app.caloriesBurned(120, 10);

        assertEquals(1200, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCaloriesBurnedInvalidMinutesThrows() {
        App app = new App();
        app.caloriesBurned(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCaloriesBurnedInvalidIntensityThrows() {
        App app = new App();
        app.caloriesBurned(10, 0);
    }
}

