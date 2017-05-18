package com.masterclass;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore =
                calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore =
                calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("Your final score was " + highScore);

        // exercise

        displayHighScorePosition("Manuel",
                calculateHighScorePosition(1500));
        displayHighScorePosition("Joaquim",
                calculateHighScorePosition(900));
        displayHighScorePosition("Gervasio",
                calculateHighScorePosition(400));
        displayHighScorePosition("Ze",
                calculateHighScorePosition(50));
    }

    private static void displayHighScorePosition(String playerName, int pos)
    {
        System.out.println(playerName + " managed to get into position " +
                pos);
    }

    private static int calculateHighScorePosition(int score) {
        if (score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        return 4;
    }

    public static int calculateScore(boolean gameOver, int score,
                                       int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }
}
