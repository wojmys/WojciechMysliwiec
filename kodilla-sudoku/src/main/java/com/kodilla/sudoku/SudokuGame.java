package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {

    private static final int GRID_SIZE = 9;
    private static boolean exit = false;

    private static int[][] board = {
            {7, 0, 2, 0, 5, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0},
            {1, 0, 0, 0, 0, 9, 5, 0, 0},
            {8, 0, 0, 0, 0, 0, 0, 9, 0},
            {0, 4, 3, 0, 0, 0, 7, 5, 0},
            {0, 9, 0, 0, 0, 0, 0, 0, 8},
            {0, 0, 9, 7, 0, 0, 0, 0, 5},
            {0, 0, 0, 2, 0, 0, 0, 0, 0},
            {0, 0, 7, 0, 4, 0, 2, 0, 3}
    };

    public static void main(String[] args) {

        startMainMenu();

        System.out.println("Board: ");
        printBoard(board);

        if (solveBoard(board)) {
            System.out.println("Solved successfully!! " + "\n");
        } else {
            System.out.println("Unsolvable board.." + "\n");
        }
        printBoard(board);
    }

    private static void startMainMenu() {
//        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("Press 1 to put some numbers into array");
            System.out.println("Press 2 to proceed with default array");
            String chosenNUmber;

            try {
                chosenNUmber = scanner.nextLine();
            } catch (Exception e) {
                continue;
            }
            switch (chosenNUmber) {
                case "1":
                    resetArray();
                    chooseNumberForArray();
                    break;
                case "2":
                    exit = true;
                    break;
                default:
                    continue;
            }
        }
    }


    private static void resetArray() {
        SudokuGame.board = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
    }

    private static void chooseNumberForArray() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Put a number (1-9) into array using a pattern below");
            System.out.println("column, row, number");

            String chosenNUmber;
            int col;
            int row;
            int number;

            try {
                chosenNUmber = scanner.nextLine();
                col = Integer.parseInt(chosenNUmber.substring(0, 1));
                row = Integer.parseInt(chosenNUmber.substring(2, 3));
                number = Integer.parseInt(chosenNUmber.substring(4, 5));

            } catch (Exception e) {
                continue;
            }
            SudokuGame.board[col - 1][row - 1] = number;

            int userChoice = askForAnotherNUmber();
            switch (userChoice) {
                case 1:
                    printBoard(board);
                    continue;
                case 2:
                    if (solveBoard(board)) {
                        System.out.println("Solved successfully!! " + "\n");
                    } else {
                        System.out.println("Unsolvable board.." + "\n");
                    }
                    printBoard(board);
                    flag = false;
                    break;
                case 3:
                    askForAnotherNUmber();
            }
        }
    }

    private static int askForAnotherNUmber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to put another number?");
        System.out.println("press 1 and ENTER for yes");
        System.out.println("type SUDOKU and press ENTER to solve");
        String result = scanner.nextLine();
        if (result.equals("1")) {
            return 1;
        } else if (result.equalsIgnoreCase("sudoku")) {
            SudokuGame.exit = true;
            return 2;
        } else {
            System.out.println("Please choose correct option");

        }
        return 3;
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int column = 0; column < GRID_SIZE; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, column) &&
                !isNumberInBox(board, number, row, column);
    }

    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (board[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;

                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

}


