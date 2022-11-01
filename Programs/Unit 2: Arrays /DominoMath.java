package Programs;

import java.util.*;

public class DominoMath {
    public static double add(double a, double b) {
        double sum = 0;
        sum = a + b;
        return sum;
    }

    public static double multiply(double a, double b) {
        double product = 0;
        // multiplication is just repeated addition
        for (int i = 1; i <= b; i++) {
            product = add(product, a);

        }
        return product;
    }

    public static double power(double a, double b) {
        // exponentiation is just repeated multiplication

        double ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = multiply(ans, a);

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which function would you like to use?");
        String response = input.nextLine();
        if (response.equals("multiply")) {
            System.out.println("Enter the numbers");
            double a = input.nextDouble();
            input.nextLine();
            double b = input.nextDouble();
            input.nextLine();
            System.out.println(a + " * " + b + " = " + multiply(a, b));
        }
        if (response.equals("add")) {
            System.out.println("Enter the numbers");
            double a = input.nextDouble();
            input.nextLine();
            double b = input.nextDouble();
            input.nextLine();
            System.out.println(a + " + " + b + " = " + add(a, b));
        }

        if (response.equals("power")) {
            System.out.println("Enter the numbers");
            double a = input.nextDouble();
            input.nextLine();
            double b = input.nextDouble();
            input.nextLine();
            System.out.println(a + "^" + b + " = " + power(a, b));
        }

        input.close();

    }

}
