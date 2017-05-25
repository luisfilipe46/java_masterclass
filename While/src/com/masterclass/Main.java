package com.masterclass;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 6;
//
//        while (true) {
//            if (count == 6)
//                break;
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 5;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);
//
//        int number = 5;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            if (!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }

        int number = 5;
        int finishNumber = 20;
        int numberOfEvenNumbers = 0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;
            numberOfEvenNumbers++;
            if (numberOfEvenNumbers >= 5)
                break;
        }

        System.out.println("Total number of even number " + numberOfEvenNumbers);
    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
