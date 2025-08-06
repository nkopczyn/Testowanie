package pl.coderslab.dates;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateManipulatorTest {

    @Test
    void parseStringToDate() {
        String dateString = "2020-01-01";
        DateManipulator dateMani = new DateManipulator();

        LocalDate result = dateMani.parseStringToDate(dateString);
        assertEquals(LocalDate.of(2020, 1, 1), result);
    }

    @Test
    void formatDateToString() {
        DateManipulator dateMani = new DateManipulator();
        LocalDate date = LocalDate.of(2020, 1, 1);
        String result = dateMani.formatDateToString(date);

        assertEquals("2020-01-01", result);
    }
}