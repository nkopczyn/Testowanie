package pl.coderslab.piramida;

public class DoseCalculator {

    // Method for calculating the corrected dose of medicine based on the corrected formula
    public static double calculateYoungDose(double adultDose, double childAgeInYears) {
        // Calculating the corrected dose for the child
        double correctedDose = adultDose * (childAgeInYears / childAgeInYears + 12);

        return correctedDose;
    }

    public static double calculateClarkDose(double adultDose, double childWeightKg) {
        double correctedDose = childWeightKg/68 * adultDose;

        return correctedDose;
    }


}
