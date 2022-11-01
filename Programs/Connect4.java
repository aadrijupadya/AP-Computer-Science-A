package Programs;

import java.util.*;

public class Connect4 {

    public static void display(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i][0] + " " + board[i][1] + " " + board[i][2] + " " + board[i][3] + " " + board[i][4]
                    + " " + board[i][5] + " " + board[i][6] + " | " + (i + 1));
            System.out.println();
            if (i == 5) {
                System.out.println("_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_");
                System.out.println(1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7);
            }
        }

    }

    public static boolean checkHorizWin(String[][] board) {
        boolean win = false;

        for (int i = 0; i < board.length; i++) {
            int yellowcnt = 0;
            int redcnt = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (yellowcnt >= 4) {
                    win = true;
                    break;
                } else if (redcnt >= 4) {
                    win = true;
                    break;
                } else if ((board[i][j] != "*") && board[i][j] == "Y") {
                    yellowcnt += 1;

                } else if ((board[i][j] != "*") && board[i][j] == "R") {
                    redcnt += 1;

                } else {
                    yellowcnt = 0;
                    redcnt = 0;
                }

            }
            if (win) {
                break;
            }

        }
        return win;
    }

    public static boolean checkVertWin(String[][] board) {
        boolean win = false;

        for (int i = 0; i < board[0].length; i++) {
            int yellowcnt = 0;
            int redcnt = 0;
            for (int j = 0; j < board.length; j++) {
                if (yellowcnt >= 4) {
                    win = true;
                    break;
                } else if (redcnt >= 4) {
                    win = true;
                    break;
                } else if ((board[j][i] != "*") && (board[j][i] == "Y")) {
                    yellowcnt += 1;

                } else if ((board[j][i] != "*") && (board[j][i] == "R")) {
                    redcnt += 1;

                } else {
                    yellowcnt = 0;
                    redcnt = 0;
                }

            }
            if (win) {
                break;
            }

        }
        return win;
    }

    public static boolean checkDiagWin(String[][] board) {
        boolean win = false;

        for (int i = 0; i < board[0].length; i++) {
            int yellowcnt = 0;
            int redcnt = 0;
            for (int j = 0; j < board.length; j++) {
                if (yellowcnt >= 4) {
                    win = true;
                    break;
                } else if (redcnt >= 4) {
                    win = true;
                    break;
                } else if ((board[j][i] != "*") && (board[j][i] == "Y")) {
                    yellowcnt += 1;

                } else if ((board[j][i] != "*") && (board[j][i] == "R")) {
                    redcnt += 1;

                } else {
                    yellowcnt = 0;
                    redcnt = 0;
                }

            }
            if (win) {
                break;
            }

        }
        return win;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] board = new String[6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "*";

            }

        }
        boolean endgame = false;
        int winner = 0;
        while (!endgame) {
            display(board);
            System.out.println(
                    "Welcome to Connect4! Player One, enter the row and column numbers for where you wish to place your token.");
            int a = input.nextInt();
            input.nextLine();
            int b = input.nextInt();
            board[a - 1][b - 1] = "Y";
            if (checkHorizWin(board) || checkVertWin(board)) {
                endgame = true;

            } else {
                endgame = false;
            }

            System.out.println(endgame);
            if (endgame) {
                System.out.println("We have a winner!");
                winner = 1;

            }

            else {
                display(board);
                System.out.println(
                        "Welcome to Connect4! Player Two, enter the row and column numbers for where you wish to place your token.");
                int c = input.nextInt();
                input.nextLine();
                int d = input.nextInt();
                board[c - 1][d - 1] = "R";
                if (checkHorizWin(board) || checkVertWin(board)) {
                    endgame = true;

                } else {
                    endgame = false;
                }
                System.out.println(endgame);
                if (endgame) {
                    winner = 2;
                }

            }

        }
        display(board);
        System.out.println("The winner is Player " + winner);
        input.close();

    }
}
