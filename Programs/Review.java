// package Programs;

// import java.util.*;

// public class Review {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter number of columns");
//user input for number of columns
//         int columns = input.nextInt();
//nested for loops
//         for (int i = 1; i <= columns; i++) {
//             for (int j = 0; j < columns; j++) {
//                 if (i == 1 || i == columns) {
//                     System.out.print('*'); 
//                 } else {
//                     if (j == (columns - i)) {
//                         System.out.print("*");

//                     } else {
//                         System.out.print(" ");
//                     }

//                 }

//             }
//             System.out.println("");

//         }
//         input.close();

//     }

// }

package Programs;

import java.util.*;

public class Review {
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
