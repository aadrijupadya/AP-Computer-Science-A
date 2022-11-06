

import java.util.*;

public class RandomTest {
    public static void display(String a, String b, String c, String d, String e, String f, String g, String h,
            String i) {
        System.out.println("|-----------|");
        System.out.println("| " + a + " | " + b + " | " + c + " |");
        System.out.println("|-----------|");
        System.out.println("| " + d + " | " + e + " | " + f + " |");
        System.out.println("|-----------|");
        System.out.println("| " + g + " | " + h + " | " + i + " |");
        System.out.println("|-----------|");
    }

    public static void main(String[] args) {
        // Math.random() gives you a double from 0<= x < 1, if you generate enough of
        // them, should display normal distribution
        for (int i = 0; i < 1000; i++) {
            System.out.println((int) (Math.random() * 6) + 1);

        }
    }

}
