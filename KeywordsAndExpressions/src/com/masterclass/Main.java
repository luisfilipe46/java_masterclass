package com.masterclass;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometres = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // in the following code that I will type below, write
        //    down what parts of the code are expressions.
        int score = 100; // score = 100 -> expression
        if (score > 99) { // score > 99 -> expression
            System.out.println("You got the high score!");
            // "You got the high score!" -> expression
            score = 0; // score = 0 -> expression
        }
    }
}
