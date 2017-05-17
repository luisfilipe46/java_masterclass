package com.masterclass;

public class Main {

    public static void main(String[] args) {
        String str = "This is a string";
        System.out.println(str);

        str = str + ", and this is more";
        System.out.println(str);

        str = str + " \u00A9 2015";
        System.out.println(str);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastStr = "10";
        int myInt = 50;
        lastStr = lastStr + myInt;
        System.out.println(lastStr);

        double doubleNumber = 120.47;
        lastStr = lastStr + doubleNumber;
        System.out.println(lastStr);
    }
}
