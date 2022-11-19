import java.util.*;

public class Bubby {
    public static void main(String[] args) {
        Scanner pencil = new Scanner(System.in);
        int turn = 0;
        int[][] board = new int[7][6];
        while (turn < 42) {
            boolean FullColumn = true;
            while (FullColumn == true) {
                printBoard(board);
                if (turn % 2 == 0) {
                    System.out.println("It is Player 1's turn");
                } else {
                    System.out.println("It is Player 2's turn");
                }
                int column = pencil.nextInt();
                pencil.nextLine();
                for (int x = 0; x < 6; x++) {
                    if (board[column - 1][x] == 0) {
                        if (turn % 2 == 0) {
                            board[column - 1][x] = 1;
                        } else {
                            board[column - 1][x] = 2;
                        }
                        FullColumn = false;
                        x = x + 7;
                    }
                }
                if (FullColumn = true) {
                    System.out.println("The column is full. Choose another column.");
                }
                turn++;

            }

            if (GameOver(board)) {
                printBoard(board);
                if (turn % 2 == 0) {
                    System.out.println("Player 1 wins");
                    turn += 50;
                } else {
                    System.out.println("Player 2 wins");
                    turn += 50;
                }
            }
        }
        if (turn == 42) {
            System.out.println("DRAW!");
        }
    }

    public static void printBoard(int[][] a) {
        for (int i = a[0].length - 1; i >= 0; i--) {
            for (int k = 0; k < a.length; k++) {
                if (a[k][i] == 1) {
                    System.out.print("X ");
                }
                if (a[k][i] == 2) {
                    System.out.print("O ");
                }
                if (a[k][i] == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println(" " + (i + 1));
        }
        System.out.println("1 | 2 | 3 | 4 | 5 | 6 | 7");
    }

    public static boolean GameOver(int[][] b) {
        boolean GameOver = false;
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                if (b[m][n] != 0) {
                    if (b[m][n] == b[m][n + 1] && b[m][n] == b[m][n + 2] && b[m][n] == b[m][n + 3]) {
                        GameOver = true;
                    }
                }
            }
        }
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 6; n++) {
                if (b[m][n] != 0) {
                    if (b[m][n] == b[m + 1][n] && b[m][n] == b[m + 2][n] && b[m][n] == b[m + 3][n]) {
                        GameOver = true;
                    }
                }
            }
        }
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 3; n++) {
                if (b[m][n] != 0) {
                    if (b[m][n] == b[m + 1][n + 1] && b[m][n] == b[m + 2][n + 2] && b[m][n] == b[m + 3][n + 3]) {
                        GameOver = true;
                    }
                }
            }
        }

        // checks if there's a diagonal win ( top left to bottom right)
        for (int m = 3; m < 7; m++) {
            for (int n = 0; n < 3; n++) {
                if (b[m][n] != 0) {
                    if (b[m][n] == b[m - 1][n + 1] && b[m][n] == b[m - 2][n + 2] && b[m][n] == b[m - 3][n + 3]) {
                        GameOver = true;
                    }
                }
            }
        }

        return GameOver;
    }
}