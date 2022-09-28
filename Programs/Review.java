// package Programs;

// import java.util.*;

// public class Review {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter number of columns");
// user input for number of columns
//         int columns = input.nextInt();
// nested for loops
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

// package Programs;

// import java.util.*;

// public class Review {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter an integer");
//         int x = input.nextInt();
//         int a = x;
//         int triples = 0;
//         for (int i = 0; i <= 9; i++) {
//             x = a;
//             int cnt = 0;
//             while (x > 0) {
//                 if (x % 10 == i) {
//                     cnt++;

//                 } else {
//                     if (cnt == 3) {
//                         x = 0;

//                     } else {
//                         cnt = 0;

//                     }

//                 }
//                 x /= 10;
//                 // System.out.println(cnt);

//             }

//             if (cnt >= 3) {
//                 System.out.println("Number is a triple for this digit: " + i);
//                 triples += 1;

//             } else {
//                 // System.out.println("pass");
//             }

//         }
//         if (triples == 0) {
//             System.out.println("Yes");
//         }

//         input.close();

//     }

// }

package Programs;

import java.util.*;

public class Review {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two integers that you want to find LCM of");
        int a = input.nextInt();
        input.nextLine();
        int b = input.nextInt();
        input.nextLine();
        boolean end = false;
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;

        }
        System.out.println(a + " " + b);
        int i = b;
        System.out.println(i);
        while (!end) {
            if ((i % a == 0) && (i % b == 0)) {
                end = true;
            } else {
                i += b;
            }

        }
        System.out.println("LCM of " + a + " and " + b + ": " + i);

    }
}

// package Programs;

// import java.util.*;

// public class Review {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.println("enter two integers that you want to find LCM of");
// int a = input.nextInt();
// input.nextLine();
// int b = input.nextInt();
// input.nextLine();
// int c = input.nextInt();
// input.nextLine();
// boolean end = false;
// if (b > a) {
// int temp = a;
// a = b;
// b = temp;

// }

// if (c > a) {
// int temp = a;
// a = c;
// c = temp;

// }

// if (c > b) {
// int temp = b;
// b = c;
// c = temp;

// }
// System.out.println(a + " " + b + " " + c);

// if (a - b == b - c) {
// System.out.println("Hella lit");
// }

// }
// }