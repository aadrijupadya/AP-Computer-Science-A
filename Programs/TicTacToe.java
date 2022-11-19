 import java.util.*;

public class TicTacToe {
    public static void display(String[][] board) {
        System.out.println("|-----------|");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("|-----------|");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[][] board = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
        // String board[0][0]= board[0][0];
        // String board[0][1]= board[0][1];
        // String c = board[0][2];
        // String d = board[1][0];
        // String e = board[1][1];
        // String f = board[1][2];
        // String g = board[2][0];
        // String h = board[2][1];
        // String i = board[2][2];
        display(board);
        Boolean endgame = false;
        while (endgame == false) {

            System.out.println(
                    "Player 1, it's your turn! Enter the number that correponds to the place where you want to put your marker ");
            String pos = input.nextLine();
            // code below compares input with variables
            if (pos.equals(board[0][0])) {
                board[0][0] = "X";
            } else if (pos.equals(board[0][1])) {
                board[0][1] = "X";
            } else if (pos.equals(board[0][2])) {
                board[0][2] = "X";
            } else if (pos.equals(board[1][0])) {
                board[1][0] = "X";
            } else if (pos.equals(board[1][1])) {
                board[1][1] = "X";
            } else if (pos.equals(board[1][2])) {
                board[1][2] = "X";

            } else if (pos.equals(board[2][0])) {
                board[2][0] = "X";

            } else if (pos.equals(board[2][1])) {
                board[2][1] = "X";

            } else if (pos.equals(board[2][2])) {
                board[2][2] = "X";

            } else {
                System.out.println("Invalid response");

            }
            // checking all possible winning conditions
            if ((board[0][0] == board[0][1] && board[0][1] == board[0][2])
                    || (board[1][0] == board[1][1] && board[1][1] == board[1][2])
                    || (board[2][0] == board[2][1] && board[2][1] == board[2][2])
                    || (board[0][0] == board[1][1] && board[1][1] == board[2][2])
                    || (board[0][2] == board[1][1] && board[1][1] == board[2][0])
                    || (board[0][0] == board[1][0] && board[1][0] == board[2][0])
                    || (board[0][1] == board[1][1] && board[1][1] == board[2][1])
                    || (board[0][2] == board[1][2] && board[1][2] == board[2][2])) {
                display(board);
                System.out.println("Player 1 wins!");
                // for (String[] inner : board) {
                // for (String elem : inner) {
                // System.out.println(elem);
                // }
                // }
                endgame = true;
                // checking tie condition(all of the board filled)
            } else if ((board[0][0] != "1") && (board[0][1] != "2") && (board[0][2] != "3") && (board[1][0] != "4")
                    && (board[1][1] != "5")
                    && (board[1][2] != "6")
                    && (board[2][0] != "7") && (board[2][1] != "8") && (board[2][2] != "9")) {
                display(board);
                System.out.println("The game has ended in board[0][0]tie!");
                endgame = true;

            }
            // if player 1 hasn't won yet, then we move on to player 2 code

            if (!endgame) {
                display(board);
                System.out.println(
                        "Player 2, it's your turn! Enter the number that correponds to the place where you want to put your marker ");
                String pos2 = input.nextLine();
                if (pos2.equals(board[0][0])) {
                    board[0][0] = "O";

                } else if (pos2.equals(board[0][1])) {
                    board[0][1] = "O";

                } else if (pos2.equals(board[0][2])) {
                    board[0][2] = "O";

                } else if (pos2.equals(board[1][0])) {
                    board[1][0] = "O";

                } else if (pos2.equals(board[1][1])) {
                    board[1][1] = "O";

                } else if (pos2.equals(board[1][2])) {
                    board[1][2] = "O";

                } else if (pos2.equals(board[2][0])) {
                    board[2][0] = "O";

                } else if (pos2.equals(board[2][1])) {
                    board[2][1] = "O";

                } else if (pos2.equals(board[2][2])) {
                    board[2][2] = "O";

                } else {
                    System.out.println("Invalid response");
                }
                display(board);
                if ((board[0][0] == board[0][1] && board[0][1] == board[0][2])
                        || (board[1][0] == board[1][1] && board[1][1] == board[1][2])
                        || (board[2][0] == board[2][1] && board[2][1] == board[2][2])
                        || (board[0][0] == board[1][1] && board[1][1] == board[2][2])
                        || (board[0][2] == board[1][1] && board[1][1] == board[2][0])
                        || (board[0][0] == board[1][0] && board[1][0] == board[2][0])
                        || (board[0][1] == board[1][1] && board[1][1] == board[2][1])
                        || (board[0][2] == board[1][2] && board[1][2] == board[2][2])) {
                    display(board);
                    System.out.println("Player 2 wins!");
                    // for (String[] inner : board) {
                    // for (String elem : inner) {
                    // System.out.println(elem);
                    // }
                    // }
                    endgame = true;
                    // checking tie condition(all of the board filled)
                } else if ((board[0][0] != "1") && (board[0][1] != "2") && (board[0][2] != "3") && (board[1][0] != "4")
                        && (board[1][1] != "5")
                        && (board[1][2] != "6")
                        && (board[2][0] != "7") && (board[2][1] != "8") && (board[2][2] != "9")) {
                    display(board);
                    System.out.println("The game has ended in a tie!");
                    endgame = true;

                }

            }

        }
    }

}
