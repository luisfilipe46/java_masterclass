package com.masterclass;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " +
                calculateInterest(10_000.0, 2.0));

        for (int i = 1; i < 5 ; i++) {
            System.out.println("Loop " + i + " hello");
        }

        // exercise 1
        for (int i = 2; i <= 8; i++) {
            System.out.println("10.000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10_000.0, i)));
        }

        System.out.println("---------------------------------");

        // exercise 2
        for (int i = 8; i >= 2; i--) {
            System.out.println("10.000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10_000.0, i)));
        }

        System.out.println("---------------------------------");

        // exercise 3
        int numberOfPrimes = 0;
        for (int i = 10; i < 564564654; i++) {
            if (isPrime(i)) {
                numberOfPrimes++;
                System.out.println(i + " is a prime number");
                if (numberOfPrimes >= 10)
                    break;
            }

        }
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i= 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static double calculateInterest(double amount,
                                           double interestRate) {
        return (amount * (interestRate/100));
    }
}
