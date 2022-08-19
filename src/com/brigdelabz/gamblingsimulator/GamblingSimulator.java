package com.brigdelabz.gamblingsimulator;

public class GamblingSimulator {

    static int STAKE_PER_DAY = 100;
    static int BET_PER_GAME = 1;
    static int win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator Program");
        for (int day = 1; day <= 20; day++) {
            STAKE_PER_DAY = 100;

            while (STAKE_PER_DAY > 50 && STAKE_PER_DAY < 150) {
                int gameCheck = (int) (Math.random() * 10) % 2;
                if (gameCheck == win) {
                    STAKE_PER_DAY++;

                } else {
                    STAKE_PER_DAY--;
                }
            }
            System.out.println("Total money left after 20days : " + STAKE_PER_DAY);
        }
    }
}