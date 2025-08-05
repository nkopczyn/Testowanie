package pl.coderslab.Enum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void factorial() {
        assertThrows(IllegalArgumentException.class, () -> Calc.factorial(-2));
        // .class is the way to refer to a class object representing IllegalArgumentException type
    }

    @Test
    void squareRoot() {
        assertThrows(IllegalArgumentException.class, () -> Calc.squareRoot(-1));
    }
}