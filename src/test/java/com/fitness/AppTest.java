package com.fitness;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void caloriesBurnedCalculatesCorrectly() {
        assertEquals(300, App.caloriesBurned(30, 10));
    }

    @Test
    void caloriesBurnedThrowsOnNegative() {
        assertThrows(IllegalArgumentException.class, () -> App.caloriesBurned(-1, 10));
    }
}
