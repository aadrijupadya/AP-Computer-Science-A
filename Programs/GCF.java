package Programs;
import java.util.*;

public class GCF {
    public static void main(String[] args) {
        System.out.println("This program finds the GCF of two numbers");
        System.out.println("Enter the first number");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.nextLine();
        int y = in.nextInt();
        in.nextLine();
        int n = 10;
        int GCF = 0;
        x = Math.max(x, y);
        y = Math.min(x, y);
        int count = x;
        while (GCF == 0) {
            if (x % count == 0) {
                if (y % count == 0) {
                    GCF = count;
                }
            }
            count = count - 1;

        }
        System.out.println(GCF);

    }

}
