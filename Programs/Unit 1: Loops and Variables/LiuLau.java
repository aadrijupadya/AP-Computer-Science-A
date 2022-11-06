 ;

import java.util.*;

public class LiuLau {

    public static double mean(int a, int b, int c, int d, int e, int f, int g) {
        double sum = a + b + c + d + e + f + g;
        double mean = sum / (7);
        return mean;
        // simply taking average, keeping separate variable for sum and mean to create a
        // double mean
    }

    public static int median(int a, int b, int c, int d, int e, int f, int g) {
        int median = 0;
        int tmp = 0;
        // sorting using if conditions
        while ((a < b) || (b < c) || (c < d) || (d < e) || (e < f) || (f < g)) {
            if (a < b) {
                tmp = a;
                a = b;
                b = tmp;

            } else if (b < c) {
                tmp = b;
                b = c;
                c = tmp;

            }

            else if (c < d) {
                tmp = c;
                c = d;
                d = tmp;

            } else if (d < e) {
                tmp = d;
                d = e;
                e = tmp;

            } else if (e < f) {
                tmp = e;
                e = f;
                f = tmp;

            }

            else if (f < g) {
                tmp = f;
                f = g;
                g = tmp;

            }

        }
        median = d;
        return median;
        // Out of sorted numbers, median is simply 4th element
    }

    public static String mode(int a, int b, int c, int d, int e, int f, int g) {
        /*
         * Cnt variables store the specific number at the index, mode variables store
         * the frequency of each variable
         */
        int cnt1 = a;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        int cnt5 = 0;
        int cnt6 = 0;
        int cnt7 = 0;
        int mode1 = 1;
        int mode2 = 0;
        int mode3 = 0;
        int mode4 = 0;
        int mode5 = 0;
        int mode6 = 0;
        int mode7 = 0;
        // Comparing first element to each of the other elements
        if (cnt1 == b) {
            mode1++;

        } else {
            cnt2 = b;
            mode2++;
        }
        // else if statements basically check if we have accounted for previous elements
        // or not

        if (cnt1 == c) {
            mode1++;
        } else if (cnt2 == c) {
            mode2++;

        } else {
            cnt3 = c;
            mode3++;
        }

        if (cnt1 == d) {
            mode1++;

        } else if (cnt2 == d) {
            mode2++;

        } else if (cnt3 == d) {
            mode3++;

        } else {
            cnt4 = d;
            mode4++;
        }

        if (cnt1 == e) {
            mode1++;

        } else if (cnt2 == e) {
            mode2++;

        } else if (cnt3 == e) {
            mode3++;

        } else if (cnt4 == e) {
            mode4++;

        } else {
            cnt5 = e;
            mode5++;
        }

        if (cnt1 == f) {
            mode1++;

        } else if (cnt2 == f) {
            mode2++;

        } else if (cnt3 == f) {
            mode3++;

        } else if (cnt4 == f) {
            mode4++;

        } else if (cnt5 == f) {
            mode5++;

        } else {
            cnt6 = f;
            mode6++;
        }

        if (cnt1 == g) {
            mode1++;

        } else if (cnt2 == g) {
            mode2++;

        } else if (cnt3 == g) {
            mode3++;

        } else if (cnt4 == g) {
            mode4++;

        } else if (cnt5 == g) {
            mode5++;

        } else if (cnt6 == g) {
            mode6++;

        } else {
            cnt7 = g;
            mode7++;
        }

        // Checking which mode is largest
        String result = "Mode(s): ";
        if (mode1 >= mode2 && mode1 >= mode3 && mode1 >= mode4 && mode1 >= mode5 && mode1 >= mode6 && mode1 >= mode7) {
            result = (result + " " + cnt1);
            // If this mode is largest, we return this

            // Next If statements check if any other modes are equal to the max one, if so,
            // we add them to the final string
            if (mode2 == mode1) {
                result = (result + " " + cnt2);

            }

            if (mode3 == mode1) {
                result = (result + " " + cnt3);

            }

            if (mode4 == mode1) {
                result = (result + " " + cnt4);

            }

            if (mode5 == mode1) {
                result = (result + " " + cnt5);

            }

            if (mode6 == mode1) {
                result = (result + " " + cnt6);

            }

            if (mode7 == mode1) {
                result = (result + " " + cnt7);

            }

        } else if (mode2 >= mode1 && mode2 >= mode3 && mode2 >= mode4 && mode2 >= mode5 && mode2 >= mode6
                && mode2 >= mode7) {
            result = (result + " " + cnt2);
            if (mode1 == mode2) {
                result = (result + " " + cnt1);

            }

            if (mode3 == mode2) {
                result = (result + " " + cnt3);

            }

            if (mode4 == mode2) {
                result = (result + " " + cnt4);

            }

            if (mode5 == mode2) {
                result = (result + " " + cnt5);

            }

            if (mode6 == mode2) {
                result = (result + " " + cnt6);

            }

            if (mode7 == mode2) {
                result = (result + " " + cnt7);

            }

        } else if (mode3 >= mode1 && mode3 >= mode2 && mode3 >= mode4 && mode3 >= mode5 && mode3 >= mode6
                && mode3 >= mode7) {
            result = (result + " " + cnt3);
            if (mode1 == mode3) {
                result = (result + " " + cnt1);

            }

            if (mode2 == mode3) {
                result = (result + " " + cnt2);

            }

            if (mode4 == mode3) {
                result = (result + " " + cnt4);

            }

            if (mode5 == mode3) {
                result = (result + " " + cnt5);

            }

            if (mode6 == mode3) {
                result = (result + " " + cnt6);

            }

            if (mode7 == mode3) {
                result = (result + " " + cnt7);

            }

        } else if (mode4 >= mode1 && mode4 >= mode2 && mode4 >= mode3 && mode4 >= mode5 && mode4 >= mode6
                && mode4 >= mode7) {
            result = (result + " " + cnt4);
            if (mode1 == mode4) {
                result = (result + " " + cnt1);

            }

            if (mode2 == mode4) {
                result = (result + " " + cnt2);

            }

            if (mode3 == mode4) {
                result = (result + " " + cnt3);

            }

            if (mode5 == mode4) {
                result = (result + " " + cnt5);

            }

            if (mode6 == mode4) {
                result = (result + " " + cnt6);

            }

            if (mode7 == mode4) {
                result = (result + " " + cnt7);

            }

        } else if (mode5 >= mode1 && mode5 >= mode2 && mode5 >= mode3 && mode5 >= mode4 && mode5 >= mode6
                && mode5 >= mode7) {
            result = (result + " " + cnt5);
            if (mode1 == mode5) {
                result = (result + " " + cnt1);

            }

            if (mode2 == mode5) {
                result = (result + " " + cnt2);

            }

            if (mode3 == mode5) {
                result = (result + " " + cnt3);

            }

            if (mode4 == mode5) {
                result = (result + " " + cnt4);

            }

            if (mode6 == mode5) {
                result = (result + " " + cnt6);

            }

            if (mode7 == mode5) {
                result = (result + " " + cnt7);

            }

        } else if (mode6 >= mode1 && mode6 >= mode2 && mode6 >= mode3 && mode6 >= mode4 && mode6 >= mode5
                && mode6 >= mode7) {
            result = (result + " " + cnt6);
            if (mode1 == mode6) {
                result = (result + " " + cnt1);

            }

            if (mode2 == mode6) {
                result = (result + " " + cnt2);

            }

            if (mode3 == mode6) {
                result = (result + " " + cnt3);

            }

            if (mode4 == mode6) {
                result = (result + " " + cnt4);

            }

            if (mode5 == mode6) {
                result = (result + " " + cnt5);

            }

            if (mode7 == mode6) {
                result = (result + " " + cnt7);

            }

        } else if (mode7 >= mode1 && mode7 >= mode2 && mode7 >= mode3 && mode7 >= mode4 && mode7 >= mode5
                && mode7 >= mode6) {
            result = (result + " " + cnt7);
            if (mode1 == mode7) {
                result = (result + " " + cnt1);

            }

            if (mode2 == mode7) {
                result = (result + " " + cnt2);

            }

            if (mode3 == mode7) {
                result = (result + " " + cnt3);

            }

            if (mode4 == mode7) {
                result = (result + " " + cnt4);

            }

            if (mode5 == mode7) {
                result = (result + " " + cnt5);

            }

            if (mode6 == mode7) {
                result = (result + " " + cnt6);

            }

        }
        // Returning string result
        return result;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 7 numbers");
        // Taking 7 integers as input
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
        System.out.println(mode(a, b, c, d, e, f, g));

        input.close();

    }

}
