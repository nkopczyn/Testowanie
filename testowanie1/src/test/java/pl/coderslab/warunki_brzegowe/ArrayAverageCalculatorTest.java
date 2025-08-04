package pl.coderslab.warunki_brzegowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageCalculatorTest {

    @Test
    void calculateAverage() {

        int[] array = new int[0];
        assertThrows(IllegalArgumentException.class, () -> ArrayAverageCalculator.calculateAverage(array));

    }
}