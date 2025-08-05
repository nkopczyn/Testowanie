package pl.coderslab.Enum;

public class primeNum {
    public boolean isPrime(int num) {
        boolean result = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
            }
        }
        return result;
    }
}
