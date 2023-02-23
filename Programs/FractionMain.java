import java.util.*;

public class FractionMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Regular fraction or mixed fraction?");
            String ok = input.nextLine();
            if (ok.equals("mixed")) {
                System.out.println("Enter whole number of the first mixed fraction");
                int num1 = input.nextInt();
                input.nextLine();

                System.out.println("Enter numerator of first mixed fraction");
                int num2 = input.nextInt();
                input.nextLine();

                System.out.println("Enter denominator of first fraction");
                int num3 = input.nextInt();
                input.nextLine();
                MixedFraction a = new MixedFraction(num1, num2, num3);

                System.out.println("Enter whole number of the second mixed fraction");
                int num4 = input.nextInt();
                input.nextLine();

                System.out.println("Enter numerator of second mixed fraction");
                int num5 = input.nextInt();
                input.nextLine();

                System.out.println("Enter denominator of second fraction");
                int num6 = input.nextInt();
                input.nextLine();

                MixedFraction b = new MixedFraction(num4, num5, num6);
                Add(a, b);
                Subtract(a, b);
                Multiply(a, b);
                Divide(a, b);
                System.out.println("Would you like to continue?");
                String response = input.nextLine();
                if (response.equals("No")) {
                    loop = false;
                }

            } else {
                System.out.println("Enter numerator of first fraction");
                int num1 = input.nextInt();
                input.nextLine();
                System.out.println("Enter denominator of first fraction");
                int den1 = input.nextInt();
                input.nextLine();
                System.out.println("Enter numerator of second fraction");
                int num2 = input.nextInt();
                input.nextLine();
                System.out.println("Enter denominator of second fraction");
                int den2 = input.nextInt();
                input.nextLine();
                Fraction a = new Fraction(num1, den1);
                Fraction b = new Fraction(num2, den2);
                Add(a, b);
                Subtract(a, b);
                Multiply(a, b);
                Divide(a, b);
                System.out.println("Would you like to continue?");
                String response = input.nextLine();
                if (response.equals("No")) {
                    loop = false;
                }

            }

        }

        input.close();

    }

    public static void Add(Fraction a, Fraction b) {
        int lcm = LCM(a.getDenominator(), b.getDenominator());
        int num1 = a.getNumerator();
        int den1 = a.getDenominator();
        int num2 = b.getNumerator();
        int den2 = b.getDenominator();
        num1 *= (lcm / den1);
        den1 = lcm;
        num2 *= (lcm / den2);
        den2 = lcm;
        int finalnum = num1 + num2;
        int finaldem = lcm;
        Fraction answer = new Fraction(finalnum, finaldem);
        answer = answer.Simplify();
        System.out.println(a.toString() + " + " + b.toString() + " = " + answer.toString());

    }

    public static void Add(MixedFraction c, MixedFraction d) {
        Fraction a = c.convertToImproper();
        Fraction b = d.convertToImproper();

        int lcm = LCM(a.getDenominator(), b.getDenominator());
        int num1 = a.getNumerator();
        int den1 = a.getDenominator();
        int num2 = b.getNumerator();
        int den2 = b.getDenominator();
        num1 *= (lcm / den1);
        den1 = lcm;
        num2 *= (lcm / den2);
        den2 = lcm;
        int finalnum = num1 + num2;
        int finaldem = lcm;
        Fraction answer = new Fraction(finalnum, finaldem);
        answer = answer.Simplify();
        MixedFraction final_ans = answer.convertToMixed();
        System.out.println(c.toString() + " + " + d.toString() + " = " + final_ans.toString());

    }

    public static void Subtract(Fraction a, Fraction b) {
        int lcm = LCM(a.getDenominator(), b.getDenominator());
        int num1 = a.getNumerator();
        int den1 = a.getDenominator();
        int num2 = b.getNumerator();
        int den2 = b.getDenominator();
        num1 *= (lcm / den1);
        den1 = lcm;
        num2 *= (lcm / den2);
        den2 = lcm;
        int finalnum = num1 - num2;
        int finaldem = lcm;
        Fraction answer = new Fraction(finalnum, finaldem);
        answer = answer.Simplify();
        System.out.println(a.toString() + " - " + b.toString() + " = " + answer.toString());

    }

    public static void Subtract(MixedFraction c, MixedFraction d) {
        Fraction a = c.convertToImproper();
        Fraction b = d.convertToImproper();

        int lcm = LCM(a.getDenominator(), b.getDenominator());
        int num1 = a.getNumerator();
        int den1 = a.getDenominator();
        int num2 = b.getNumerator();
        int den2 = b.getDenominator();
        num1 *= (lcm / den1);
        den1 = lcm;
        num2 *= (lcm / den2);
        den2 = lcm;
        int finalnum = num1 - num2;
        int finaldem = lcm;
        Fraction answer = new Fraction(finalnum, finaldem);
        answer = answer.Simplify();
        MixedFraction final_ans = answer.convertToMixed();
        System.out.println(c.toString() + " - " + d.toString() + " = " + final_ans.toString());

    }

    public static void Multiply(Fraction a, Fraction b) {
        int num1 = a.getNumerator();
        int den1 = a.getDenominator();
        int num2 = b.getNumerator();
        int den2 = b.getDenominator();
        int finalnum = num1 * num2;
        int finaldem = den1 * den2;
        Fraction answer = new Fraction(finalnum, finaldem);
        answer = answer.Simplify();
        System.out.println(a.toString() + " * " + b.toString() + " = " + answer.toString());

    }

    public static void Multiply(MixedFraction c, MixedFraction d) {
        Fraction a = c.convertToImproper();
        Fraction b = d.convertToImproper();
        int num1 = a.getNumerator();
        int den1 = a.getDenominator();
        int num2 = b.getNumerator();
        int den2 = b.getDenominator();
        int finalnum = num1 * num2;
        int finaldem = den1 * den2;
        Fraction answer = new Fraction(finalnum, finaldem);
        answer = answer.Simplify();
        MixedFraction final_ans = answer.convertToMixed();
        System.out.println(c.toString() + " * " + d.toString() + " = " + final_ans.toString());

    }

    public static void Divide(Fraction a, Fraction b) {
        int num1 = a.getNumerator();
        int den1 = a.getDenominator();
        int num2 = b.getNumerator();
        int den2 = b.getDenominator();
        int finalnum = den1 * den2;
        int finaldem = num1 * num2;
        Fraction answer = new Fraction(finalnum, finaldem);
        answer = answer.Simplify();
        System.out.println(a.toString() + " / " + b.toString() + " = " + answer.toString());

    }

    public static void Divide(MixedFraction c, MixedFraction d) {
        Fraction a = c.convertToImproper();
        Fraction b = d.convertToImproper();
        int num1 = a.getNumerator();
        int den1 = a.getDenominator();
        int num2 = b.getNumerator();
        int den2 = b.getDenominator();
        int finalnum = den1 * den2;
        int finaldem = num1 * num2;
        Fraction answer = new Fraction(finalnum, finaldem);
        answer = answer.Simplify();
        MixedFraction final_ans = answer.convertToMixed();
        System.out.println(c.toString() + " / " + d.toString() + " = " + final_ans.toString());

    }

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

}
