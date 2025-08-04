package pl.coderslab.wprowadzenie;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int safeAdd(int a, int b) {
        long sum = (long) a + b;
        if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
            throw new ArithmeticException("Integer overflow");
        }
        return (int) sum;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

