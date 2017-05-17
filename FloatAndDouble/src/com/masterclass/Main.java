package com.masterclass;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int intValue = 5 / 3;

        // width of float = 32 (4 bytes)
        float floatValue = 5f / 3f;

        // width of double = 64 (8 bytes)
        double doubleValue = 5d / 3d;

        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        // exercise

        double pounds = 200d;
        double kgs = pounds * 000_000.453_592_37;
        System.out.println("kgs = " + kgs);
    }
}
