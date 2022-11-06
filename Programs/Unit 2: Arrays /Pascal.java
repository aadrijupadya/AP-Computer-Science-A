 

import java.util.*;

public class Pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which row of pascal's triangle do you want");
        int row = input.nextInt();
        int[] start = { 1 };
        input.nextLine();
        input.close();

        for (int i = 0; i < row - 1; i++) {
            start = nextRow(start);
            // calling the function multiple times, until we get desired row
        }

        for (int temp : start) {
            System.out.print(temp + " ");
            // for each loop to print each element

        }
    }

    public static int[] nextRow(int[] b) {

        int[] row = new int[b.length + 1];
        // each row length increases by 1
        row[0] = 1;
        // assigning first element as 1
        for (int i = 1; i < b.length; i++) {
            row[i] = b[i - 1] + b[i];
            // each element is essentially sum of index of element and previous one

        }
        row[b.length] = 1;
        // last alignment is 1
        return row;
    }

}
