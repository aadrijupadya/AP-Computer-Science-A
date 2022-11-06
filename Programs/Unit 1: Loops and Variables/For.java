 ;
import java.util.*;

public class For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int sum = 0;
        Boolean isprime = true;
        for (int i = (f - 1); i >= 2; i--) {
            if (f % i == 0) {
                isprime = false;

            }

        }
        if (isprime) {
            System.out.println("Number is prime!");
        }

        else {
            System.out.println("Number is composite!");

        }
    }
}