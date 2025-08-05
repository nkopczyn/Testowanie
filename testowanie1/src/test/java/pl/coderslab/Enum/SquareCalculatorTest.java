package pl.coderslab.Enum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.EnumOptions;

import static org.junit.jupiter.api.Assertions.*;

class SquareCalculatorTest {

    enum SquareScenario {
        POSITIVE_NUMBER(8, 64),
        NEGATIVE_NUMBER(-4, 16),
        ZERO(0, 0);

        final int input;
        final int expectedOutput;

        SquareScenario(int input, int expectedOutput) {
            this.input = input;
            this.expectedOutput = expectedOutput;

            // czyli każdy z elementów enum - positive_number, zero, negative_number - będzie miał te pola input i expectedOutput
        }
    }

    @ParameterizedTest
    @EnumSource(SquareScenario.class) //.class czyli test wykona się dla każdego elementu tej klasy osobno
    void square(SquareScenario scenario) {
        int input = scenario.input;
        int expectedOutput = scenario.expectedOutput;

        int actualOutput = SquareCalculator.square(input);

        assertEquals(expectedOutput, actualOutput);
    }
}