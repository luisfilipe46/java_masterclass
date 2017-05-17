package com.masterclass;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int minValue = -2_147_483_648;
        int maxValue = 2_147_483_647;
        int total = minValue/2;

        // byte has a width of 8
        byte byteValue = -128;
        byte newByteValue = (byte) (byteValue/2);
        //System.out.println("newByteValue = " + newByteValue);

        // short has a width of 16
        short shortValue = 32_767;
        short newShortValue = (short) (shortValue/2);

        // long has a width of 64
        long longValue = 100L;
        long minLongValue = 9_223_372_036_854_775_807L;


        // exercise
        byte byteVal = 85;
        short shortVal = 45;
        int intVal = 54_864;
        long longVal = 50_000 + 10 * (byteVal + shortVal + intVal);
        System.out.println(longVal);
    }
}
