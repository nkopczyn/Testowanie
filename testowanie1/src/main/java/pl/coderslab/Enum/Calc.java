package pl.coderslab.Enum;

public class Calc {
    public static int factorial(int number) {
        if (number <  0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result =  1;
        for (int i =  1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int squareRoot(int number) {
        if (number<0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        return (int) Math.sqrt(number);
    }
}
