package com.masterclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values\n");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++)
            values[i] = scanner.nextInt();

        return values;
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
            System.out.println("Element " + i + " contents " +
                    array[i]);
    }

    public static int[] sortIntegers(int[] array) {
        Integer[] integers = Arrays.stream(array).boxed().toArray(
                Integer[]::new);
        Arrays.sort(integers, Collections.reverseOrder());
        return Arrays.stream(integers)
                .mapToInt(Integer::intValue)
                .toArray();
        //return integers;
    }
}
