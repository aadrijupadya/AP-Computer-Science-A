package Programs;

import java.util.*;

public class ArrayFractions {
    public static int LCM(int a, int b) {
        int LCM = 0;
        boolean end = false;
        int i = b;
        while (!end) {
            if ((i % a == 0) && (i % b == 0)) {
                end = true;
            } else {
                i += b;
            }

        }
        LCM = i;

        return LCM;

    }

    public static int GCF(int a, int b) {
        int GCF = 0;
        int tmp = 0;
        if (b >= a) {
            tmp = b;
            b = a;
            a = tmp;
        }
        int count = a;
        while (GCF == 0) {
            if (a % count == 0) {
                if (b % count == 0) {
                    GCF = count;
                }
            }
            count--;

        }
        return GCF;

    }

    public static void Add(int[] frac1, int[] frac2) {
        int[] finalfrac = new int[2];
        int x = frac1[0];
        int y = frac1[1];
        int z = frac2[0];
        int a = frac2[1];
        int decoy1 = frac1[0];
        int decoy2 = frac1[1];
        int decoy3 = frac2[0];
        int decoy4 = frac2[1];

        int LCM = LCM(a, y);
        x *= (LCM / y);
        z *= (LCM / a);
        y = LCM;
        a = LCM;
        System.out.print("LCM: " + LCM);

        int finalnum = x + z;
        int finaldem = a;

        finalfrac[0] = finalnum;
        finalfrac[1] = finaldem;
        finalfrac = Simplify(finalfrac);

        System.out.println(
                decoy1 + "/" + decoy2 + " + " + decoy3 + "/" + decoy4 + " = " + finalfrac[0] + "/" + finalfrac[1]);

    }

    public static void Sub(int[] frac1, int[] frac2) {

        int x = frac1[0];
        int y = frac1[1];
        int z = frac2[0];
        int a = frac2[1];
        int decoy1 = frac1[0];
        int decoy2 = frac1[1];
        int decoy3 = frac2[0];
        int decoy4 = frac2[1];

        int LCM = LCM(a, y);
        x *= (LCM / y);
        z *= (LCM / a);
        y = LCM;
        a = LCM;

        int finalnum = x - z;
        int finaldem = a;
        int[] finalfrac = new int[2];
        finalfrac[0] = finalnum;
        finalfrac[1] = finaldem;
        finalfrac = Simplify(finalfrac);

        System.out.println(
                decoy1 + "/" + decoy2 + " - " + decoy3 + "/" + decoy4 + " = " + finalfrac[0] + "/" + finalfrac[1]);

    }

    public static void Mult(int[] frac1, int[] frac2) {

        int x = frac1[0];
        int y = frac1[1];
        int z = frac2[0];
        int a = frac2[1];
        int decoy1 = frac1[0];
        int decoy2 = frac1[1];
        int decoy3 = frac2[0];
        int decoy4 = frac2[1];

        int finalnum = x * z;
        int finaldem = y * a;
        int[] finalfrac = new int[2];
        finalfrac[0] = finalnum;
        finalfrac[1] = finaldem;
        finalfrac = Simplify(finalfrac);

        System.out.println(
                decoy1 + "/" + decoy2 + " * " + decoy3 + "/" + decoy4 + " = " + finalfrac[0] + "/" + finalfrac[1]);

    }

    public static void Div(int[] frac1, int[] frac2) {
        int x = frac1[0];
        int y = frac1[1];
        int z = frac2[1];
        int a = frac2[0];
        int decoy1 = frac1[0];
        int decoy2 = frac1[1];
        int decoy3 = frac2[0];
        int decoy4 = frac2[1];

        int finalnum = x * z;
        int finaldem = y * a;
        int[] finalfrac = new int[2];
        finalfrac[0] = finalnum;
        finalfrac[1] = finaldem;
        finalfrac = Simplify(finalfrac);

        System.out.println(
                decoy1 + "/" + decoy2 + " / " + decoy3 + "/" + decoy4 + " = " + finalfrac[0] + "/" + finalfrac[1]);

    }

    public static int[] Simplify(int[] frac) {
        int GCF = GCF(frac[0], frac[1]);
        frac[0] /= GCF;
        frac[1] /= GCF;
        System.out.println("Simplified fraction: " + frac[0] + "/" + frac[1]);
        return frac;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numerator");
        int numerator = input.nextInt();
        input.nextLine();
        System.out.println("enter the denominator");
        int denominator = input.nextInt();
        input.nextLine();
        System.out.println("enter the second numerator");
        int numerator2 = input.nextInt();
        input.nextLine();
        System.out.println("enter the second denominator");
        int denominator2 = input.nextInt();
        input.nextLine();
        int[] fraction1 = new int[2];
        int[] fraction2 = new int[2];
        fraction1[0] = numerator;
        fraction1[1] = denominator;
        fraction2[0] = numerator2;
        fraction2[1] = denominator2;
        System.out.println("Which operation would you like to perform?");
        String response = input.nextLine();
        if (response.equals("Addition")) {
            Add(fraction1, fraction2);

        }

        if (response.equals("Subtraction")) {
            Sub(fraction1, fraction2);

        }

        if (response.equals("Multiplication")) {
            Mult(fraction1, fraction2);

        }
        if (response.equals("Division")) {
            Div(fraction1, fraction2);

        }

        if (response.equals("Simplify")) {
            Simplify(fraction1);
            Simplify(fraction2);

        }

        input.close();

    }

}
