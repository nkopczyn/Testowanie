package pl.coderslab.piramida;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoseCalculatorTest {

    @Test
    void calculateYoungDose() {
        // Sample patient data
        double adultDose = 200; // Maximum dose for adults in milligrams
        double childAge = 6; // Child's age in years

        // Calculating the corrected dose for the child
        double correctedDose = DoseCalculator.calculateYoungDose(adultDose, childAge);

    }

    @Test
    void calculateClarkDose() {
        double adultDose = 200;
        double childWeight = 35;

        double correctedDose = DoseCalculator.calculateClarkDose(adultDose, childWeight);
        assertEquals(102.94117647058823, correctedDose);
    }
}