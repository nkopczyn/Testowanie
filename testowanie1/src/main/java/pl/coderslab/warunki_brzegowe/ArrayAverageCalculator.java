package pl.coderslab.warunki_brzegowe;

public class ArrayAverageCalculator {

    public static double calculateAverage(int[] array) {
        double sum = 0;
        double avg = 0;
        if (!(array.length == 0)) {
            for (int num : array) {
                sum += num;
            }
            avg = sum / array.length;
            return avg;
        } else {
            throw new IllegalArgumentException("Array is empty");
        }
    }
}
