
import java.util.*;

public class Rockets {
    public static void main(String[] args) {
        /*
         * Escape Sequences
         * \n = newline,
         * \" = quotation
         * \\ = single blackslack
         * \t = tab"
         */
        // System.out.println(" /\\");
        // System.out.println("/ \\");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String var = input.nextLine();
        System.out.println("         /\\");
        System.out.println("        /  \\");
        System.out.println("       /    \\");
        System.out.println("      /      \\");
        System.out.println("     /        \\");
        System.out.println("    /          \\");
        System.out.println("   |            |");
        System.out.println("   |            |");
        System.out.println("   |            |");
        System.out.println("   |  \"" + var + "\"  |");
        System.out.println("   |            |");
        System.out.println("   |            |");
        System.out.println("   |            |");
        System.out.println("   |            |");
        System.out.println("  /              \\");
        System.out.println(" /                \\");
        System.out.println("/                  \\");
        System.out.println("____________________");
        System.out.println("      ||   ||");
        System.out.println("      ||   ||");
    }
}
