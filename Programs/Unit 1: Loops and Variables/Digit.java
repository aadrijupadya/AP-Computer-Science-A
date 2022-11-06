 ;

import java.util.*;

public class Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        boolean end = false;
        boolean one = false;
        boolean two = false;
        boolean seven = false;
        while (!end) {
            if (n % 10 == 1) {
                one = true;
            }

            else if (n % 10 == 2) {
                two = true;
            }

            else if (n % 10 == 7) {
                seven = true;
            }
            n /= 10;
            if (n == 0) {
                end = true;
            }

        }

        if (one && seven && two) {
            System.out.print("hella true");
        } else if (one || seven || two) {
            System.out.print("true");
        }
        input.close();

    }

}
