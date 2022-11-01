package Programs;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for (int i = n; i >= 2; i--) {
            boolean isPrime = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;

                }

            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }

}
