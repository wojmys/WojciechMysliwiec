package com.kodilla.rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    private String name;
    private int numberOfRounds;
    private boolean flag = true;
    private int computerScore;
    private int gamerScore;
    private String gamersMove;
    private String computersMove;

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void startGame() {
        System.out.println("Welcome to Rock Paper Scissors game !" + "\n");
    }

    public void askForName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type your name and press ENTER to confirm");
        this.name = scanner.nextLine();
        if (name.isEmpty()) {
            askForName();
        } else {
            System.out.println("Hello " + name + "!" + "\n");
            askHowManyRounds();
        }
    }

    public void askHowManyRounds() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please type a number of rounds");

            this.numberOfRounds = scanner.nextInt();
            if (numberOfRounds <= 0) {
                System.out.println("Number of rounds must be an Integer value" + "\n" + "and cannot be 0 or less" + "\n");
                askHowManyRounds();
            } else {
                presentRules();
            }
        } catch (Exception e) {
            System.out.println("Number of rounds must be an Integer value" + "\n" + "and cannot be 0 or less" + "\n");
            askHowManyRounds();
        }
    }

    public void presentRules() {
        System.out.println("How to play:\n");

        System.out.println("Press 1 – to choose \"rock\"\n" +
                "Press 2 – to choose \"paper\"\n" +
                "press 3 – to choose \"scissors\"\n" +
                "press x – to quit game \n" +
                "press n – to start a new game \n");

        nextRound();
    }

    public void checkWinner(int number) {
        Random random = new Random();
        int numberGenerated = random.nextInt(1, 4);

        if (number == 1 && numberGenerated == 3) {
            gamerScore++;
        } else if (number == 2 && numberGenerated == 1) {
            gamerScore++;
        } else if (number == 3 && numberGenerated == 2) {
            gamerScore++;
        } else if (number == numberGenerated) {

        } else {
            computerScore++;
        }

        presentMove(number, numberGenerated);
    }

    public void presentMove(int number, int numberGenerated) {

        switch (number) {
            case 1:
                this.gamersMove = "Rock";
                break;
            case 2:
                this.gamersMove = "Paper";
                break;
            case 3:
                this.gamersMove = "Scissors";
                break;
        }

        switch (numberGenerated) {
            case 1:
                this.computersMove = "Rock";
                break;
            case 2:
                this.computersMove = "Paper";
                break;
            case 3:
                this.computersMove = "Scissors";
                break;
        }
        System.out.println(name + " used: " + gamersMove);
        System.out.println("Computer used: " + computersMove + "\n");

        System.out.println("Result:\n"
                + name + ": " + gamerScore + " points\n"
                + "Computer" + ": " + computerScore + " points" + "\n"
        );

    }

    public void endGame() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("press x – to quit game \n" +
                    "press n – to start a new game \n");
            String quitOrNewGame = scanner.nextLine();

            if (quitOrNewGame.equals("x")) {
                System.out.println("Shutting down");
                System.exit(0);
            } else if (quitOrNewGame.equals("n")) {
                startGame();
                askForName();
            } else {
                endGame();
            }
        } catch (Exception e) {
            endGame();
        }
    }
    public void nextRound() {
        flag=true;
        int count = 1;
        int round = numberOfRounds;

        while (flag) {

            if (round == 0) {
                flag = false;
                System.out.println("End result:\n");
                System.out.println(name + ": " + gamerScore + " points");
                System.out.println("computer" + ": " + computerScore + " points");
                endGame();

            }else {

            System.out.println("Round " + count);

            System.out.println("Press 1 – to choose \"rock\"\n" +
                    "Press 2 – to choose \"paper\"\n" +
                    "press 3 – to choose \"scissors\"\n"
            );

            Scanner scanner = new Scanner(System.in);
            int menuNumber = scanner.nextInt();

            switch (menuNumber) {

                case 1:
                    checkWinner(1);
                    round--;
                    count++;
                    break;

                case 2:
                    checkWinner(2);
                    round--;
                    count++;
                    break;

                case 3:
                    checkWinner(3);
                    round--;
                    count++;
                    break;

                default:
                    System.out.println("Please enter correct number");
                    continue;
            }
            }
        }
    }
}


