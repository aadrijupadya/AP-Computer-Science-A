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
        while (n > 0) {
            n = n - m;
            i += 1;

        }
        if (n == 0) {
            System.out.println("Answer: " + i);

        } else {
            int remainder = (n + m);
            // System.out.print(i + ".");
            // int j = 0;
            // while (remainder > 0) {
            // remainder = remainder - m;
            // j += 1;

            // }
            // System.out.print(j);
            System.out.println("Answer: " + (i - 1) + " Remainder: " + remainder);

        }

    }

}
