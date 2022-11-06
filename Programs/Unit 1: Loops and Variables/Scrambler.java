 ;

import java.util.*;

public class Scrambler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = input.nextInt();
        input.nextLine();
        int i = 0;
        int run = 0;
        while (password > 10) {
            int n = password % 10;
            int temp = password % 100;
            int pow = 1;
            if (temp == 19) {
                temp = 91;
            }
            for (int k = 0; k <= i; k++) {
                pow *= 10;

            }
            if (temp != 91) {
                run += (pow * n);

            } else {
                run += (temp * pow);
                password /= 10;
                // i++;
            }
            password /= 10;
            i++;
        }
        System.out.println(run);
        input.close();
    }

}
