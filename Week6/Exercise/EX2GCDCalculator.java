import java.util.Scanner;

public class EX2GCDCalculator {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int primesPerLine = 10;

        System.out.println("The first 50 prime numbers are:");

        while (count < 50) {
            if (isPrime(number)) {
                System.out.printf("%-5d", number);
                count++;

                if (count % primesPerLine == 0) {
                    System.out.println();
                }
            }
            number++;
        }

        if (count % primesPerLine != 0) {
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
