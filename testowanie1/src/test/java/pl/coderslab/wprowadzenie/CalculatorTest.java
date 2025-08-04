package pl.coderslab.wprowadzenie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int x = 6;
        int y = 8;

        Calculator calculator = new Calculator();
        int result = calculator.add(x, y);
        assertEquals(14, result);
    }

    @Test
    public void testAddZeroToNumber() {

        Calculator calculator = new Calculator();
        int result = calculator.add(7, 0);
        assertEquals(7, result);
    }

    @Test
    void zeroMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(0, 7);
        assertEquals(0, result);
    }

    @Test
    void substractZeroFromNegative() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(0, -7);
        assertEquals(7, result);
    }
}