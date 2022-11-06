 ;

import java.util.*;

public class Nested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of columns");
        int columns = input.nextInt();

        for (int i = 1; i <= columns; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 1 || i == columns) {
                    System.out.print('*');
                } else {
                    if (j == (columns - i)) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println("");

        }
        input.close();

    }

}
