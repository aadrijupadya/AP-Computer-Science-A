 ;

import java.util.*;

public class DivisionWithoutDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Dividend");
        int n = in.nextInt();
        in.nextLine();
        System.out.println("Enter Divisor");
        int m = in.nextInt();
        in.nextLine();
        int i = 0;
        boolean quit = false;
        boolean print = true;
        int dot = 0;
        while ((!quit) && (n > 0)) {
            while (n >= m) {
                n = n - m;
                i += 1;
            }
            if (n == 0) {
                System.out.print(i);
                quit = true;
                print = false;

            } else {
                n = n + n + n + n + n + n + n + n + n + n;
            }
            if (print && dot == 0) {
                System.out.print(i + ".");
                i = 0;
                dot += 1;

            } else if (print && dot != 0) {
                System.out.print(i);
                i = 0;

            }

        }

    }

}
