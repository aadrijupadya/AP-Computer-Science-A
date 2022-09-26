package Programs;
import java.util.*;

public class ttt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";
        String e = "5";
        String f = "6";
        String g = "7";
        String h = "8";
        String i = "9";
        // initializing variables to represent placeholder numbers
        System.out.println("|-----------|");
        System.out.println("| " + a + " | " + b + " | " + c + " |");
        System.out.println("|-----------|");
        System.out.println("| " + d + " | " + e + " | " + f + " |");
        System.out.println("|-----------|");
        System.out.println("| " + g + " | " + h + " | " + i + " |");
        System.out.println("|-----------|");
        // creating GUI for tic-tac-toe board
        Boolean endgame = false;
        // Breakout condition
        while (endgame == false) {

            System.out.println(
                    "Player 1, it's your turn! Enter the number that correponds to the place where you want to put your marker ");
            String pos = input.nextLine();
            // code below compares input with variables
            if (pos.equals(a)) {
                a = "X";
            } else if (pos.equals(b)) {
                b = "X";
            } else if (pos.equals(c)) {
                c = "X";
            } else if (pos.equals(d)) {
                d = "X";
            } else if (pos.equals(e)) {
                e = "X";
            } else if (pos.equals(f)) {
                f = "X";

            } else if (pos.equals(g)) {
                g = "X";

            } else if (pos.equals(h)) {
                h = "X";

            } else if (pos.equals(i)) {
                i = "X";

            } else {
                System.out.println("Invalid response");

            }
            // checking all possible winning conditions
            if ((a == b && b == c) || (d == e && e == f) || (g == h && h == i) || (a == e && e == i)
                    || (c == e && e == g) || (a == d && d == g) || (b == e && e == h) || (c == f && f == i)) {
                System.out.println("Player 1 wins!");
                endgame = true;
                // checking tie condition(all of the board filled)
            } else if ((a != "1") && (b != "2") && (c != "3") && (d != "4") && (e != "5") && (f != "6")
                    && (g != "7") && (h != "8") && (i != "9")) {

                System.out.println("The game has ended in a tie!");
                endgame = true;

            }
            // if player 1 hasn't won yet, then we move on to player 2 code

            if (!endgame) {
                System.out.println("|-----------|");
                System.out.println("| " + a + " | " + b + " | " + c + " |");
                System.out.println("|-----------|");
                System.out.println("| " + d + " | " + e + " | " + f + " |");
                System.out.println("|-----------|");
                System.out.println("| " + g + " | " + h + " | " + i + " |");
                System.out.println("|-----------|");
                System.out.println(
                        "Player 2, it's your turn! Enter the number that correponds to the place where you want to put your marker ");
                String pos2 = input.nextLine();
                if (pos2.equals(a)) {
                    a = "O";

                } else if (pos2.equals(b)) {
                    b = "O";

                } else if (pos2.equals(c)) {
                    c = "O";

                } else if (pos2.equals(d)) {
                    d = "O";

                } else if (pos2.equals(e)) {
                    e = "O";

                } else if (pos2.equals(f)) {
                    f = "O";

                } else if (pos2.equals(g)) {
                    g = "O";

                } else if (pos2.equals(h)) {
                    h = "O";

                } else if (pos2.equals(i)) {
                    i = "O";

                } else {
                    System.out.println("Invalid response");
                }
                System.out.println("|-----------|");
                System.out.println("| " + a + " | " + b + " | " + c + " |");
                System.out.println("|-----------|");
                System.out.println("| " + d + " | " + e + " | " + f + " |");
                System.out.println("|-----------|");
                System.out.println("| " + g + " | " + h + " | " + i + " |");
                System.out.println("|-----------|");
                if ((a == b && b == c) || (d == e && e == f) || (g == h && h == i) || (a == e && e == i)
                        || (c == e && e == g) || (a == d && d == g) || (b == e && e == h) || (c == f && f == i)) {
                    System.out.println("Player 2 wins!");
                    endgame = true;
                } else if ((a != "1") && (b != "2") && (c != "3") && (d != "4") && (e != "5") && (f != "6")
                        && (g != "7") && (h != "8") && (i != "9")) {

                    System.out.println("The game has ended in a tie!");
                    endgame = true;

                }

            }

        }

    }

}
