package Programs;

import java.util.*;

public class LiuLau {
    public static double mean(int a, int b, int c, int d, int e, int f, int g) {
        double sum = a + b + c + d + e + f + g;
        double mean = sum / (7);
        return mean;
    }

    public static double median(int a, int b, int c, int d, int e, int f, int g) {
        int median = 0;
        boolean sorted = false;
        int min = 0;
        int tmp = 0;

        while ((a < b) || (b < c) || (c < d) || (d < e) || (e < f) || (f < g)) {
            System.out.println("sorting");
            if (a < b) {
                tmp = a;
                a = b;
                tmp = b;

            } else if (b < c) {
                tmp = b;
                b = c;
                tmp = c;

            }

            else if (c < d) {
                tmp = c;
                c = d;
                tmp = d;

            } else if (d < e) {
                tmp = d;
                d = e;
                tmp = e;

            } else if (e < f) {
                tmp = e;
                e = f;
                tmp = f;

            }

            else if (f < g) {
                tmp = f;
                f = g;
                tmp = g;

            }

        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);

        return median;
    }

    public static int mode(int a, int b, int c, int d, int e, int f, int g) {
        int mode = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("u");
        }
        return mode;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 7 numbers");
        int a = input.nextInt();
        input.nextLine();
        int b = input.nextInt();
        input.nextLine();
        int c = input.nextInt();
        input.nextLine();
        int d = input.nextInt();
        input.nextLine();
        int e = input.nextInt();
        input.nextLine();
        int f = input.nextInt();
        input.nextLine();
        int g = input.nextInt();
        input.nextLine();
        System.out.println("Mean of numbers: " + mean(a, b, c, d, e, f, g));
        System.out.println("Median of numbers: " + median(a, b, c, d, e, f, g));
        // System.out.println("Mode of numbers: " + mode(a, b, c, d, e, f, g));

        input.close();

    }

}
