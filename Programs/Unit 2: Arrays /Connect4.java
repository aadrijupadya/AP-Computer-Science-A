 

import java.util.*;

public class Connect4 {
    // helper function to display board
    public static void display(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i][0] + " " + board[i][1] + " " + board[i][2] + " " + board[i][3] + " " + board[i][4]
                    + " " + board[i][5] + " " + board[i][6] + " | ");
            System.out.println();
            if (i == 5) {
                System.out.println("_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_");
                System.out.println(0 + " " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6);
            }
        }
    }

    // this function checks if the column is full or not, chooses index for where
    // token is placed

    public static int checkIndex(String[][] board, int col) {
        int index = 100;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][col] == "*")) {
                index = i;
            }
        }

        return index;

    }

    // horizontal win condition
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

    // vertical win condition
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

    // diagonal win conditions
    public static boolean checkDiagWin(String[][] board, String player) {
        boolean win = false;
        // upward diagonal, ex: {(0,5), (1,4), (2,3)...}
        for (int row = 3; row < board.length; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col] == player &&
                        board[row - 1][col + 1] == player &&
                        board[row - 2][col + 2] == player &&
                        board[row - 3][col + 3] == player) {
                    win = true;
                }
            }
        }
        // downward diagonal
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col] == player &&
                        board[row + 1][col + 1] == player &&
                        board[row + 2][col + 2] == player &&
                        board[row + 3][col + 3] == player) {
                    win = true;
                }
            }
        }
        return win;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] board = new String[6][7];
        // assigning values to "*" as a default
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
                    "Welcome to Connect4! Player One, enter the column number for where you wish to place your token.");
            int a = input.nextInt();
            int b = checkIndex(board, a);
            if (b > board.length) {
                System.out.println("This column is full, try another column");

            } else {
                board[b][a] = "Y";
            }
            // Any of these winning conditions will trigger endgame
            if (checkHorizWin(board) || checkVertWin(board) || checkDiagWin(board, "Y")) {
                endgame = true;

            } else {
                endgame = false;
            }

            if (endgame) {
                System.out.println("We have a winner!");
                // store winner in a variable
                winner = 1;

            }

            else {
                display(board);
                System.out.println(
                        "Welcome to Connect4! Player Two, enter the column number for where you wish to place your token.");
                int c = input.nextInt();
                input.nextLine();
                int d = checkIndex(board, c);
                if (d > board.length) {
                    System.out.println("This column is full, try another column");
                } else {
                    board[d][c] = "R";
                }
                if (checkHorizWin(board) || checkVertWin(board) || checkDiagWin(board, "R")) {
                    endgame = true;

                } else {
                    endgame = false;
                }
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
