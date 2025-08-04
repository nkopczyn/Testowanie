package pl.coderslab.parametryzowanie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    @ParameterizedTest
    @ValueSource (strings = {"SATURDAY", "SUNDAY"})
    void isWeekend(String day) {
        boolean date = DateUtils.isWeekend(DayOfWeek.valueOf(day));
        assertTrue(date);
    }

    @ParameterizedTest
    @ValueSource(strings = {"MONDAY", "TUESDAY", "WEDNESDAY"})
    void isWeekday(String day) {
        boolean date = DateUtils.isWeekend(DayOfWeek.valueOf(day));
        assertFalse(date);
    }

}