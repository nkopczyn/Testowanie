package pl.coderslab.Enum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class primeNumTest {

    enum testEnumNums {
        NUMBER_2(2, true),
        NUMBER_3(3, true),
        NUMBER_4(4, false),
        NUMBER_5(5, true),
        NUMBER_6(6, false),
        NUMBER_7(7, true),
        NUMBER_8(8, false),
        NUMBER_9(9, false),
        NUMBER_10(10, false),
        NUMBER_11(11, true),
        NUMBER_12(12, false);

        final int input;
        final boolean expectedResult;

        testEnumNums(int input, boolean expectedResult) {
            this.input = input;
            this.expectedResult = expectedResult;
        }
    }


    @ParameterizedTest
    @EnumSource(testEnumNums.class)
    void isPrime(testEnumNums enumNumberPair) {
        int input = enumNumberPair.input;
        boolean expectedResult = enumNumberPair.expectedResult;

        primeNum primeNumObject = new primeNum();
        boolean actualResult = primeNumObject.isPrime(input);

        assertEquals(expectedResult, actualResult);
    }
}