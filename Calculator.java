import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        String response = "yes";

        while (response.equals("yes")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Aadrij's Calculator");
            System.out.println("Which operation would you like to perform? Please choose a number");
            System.out.println("1 addition");
            System.out.println("2 subtraction");
            System.out.println("3 multiplication");
            System.out.println("4 division");

            int operation = input.nextInt();
            input.nextLine();
            System.out.println("Please enter 2 whole numbers");

            System.out.println("First number: ");
            int int1 = input.nextInt();
            input.nextLine();

            System.out.println("Second number: ");
            int int2 = input.nextInt();
            input.nextLine();

            if (operation == 1) {

                System.out.println("The sum is: " + (int1 + int2));
                System.out.println("Do you want to use the calculation again(yes/no)");
                response = input.nextLine();

            }

            else if (operation == 2) {

                System.out.println("The difference is: " + (int1 - int2));

                System.out.println("Do you want to use the calculation again(yes/no)");
                response = input.nextLine();

            }

            else if (operation == 3) {

                System.out.println("The product is: " + (int1 * int2));

                System.out.println("Do you want to use the calculation again(yes/no)");
                response = input.nextLine();

            }

            else if (operation == 4) {
                System.out.println("Press 1. for output an answer with remainder");
                System.out.println("Press 2. for decimal output");
                int type = input.nextInt();
                input.nextLine();
                if (type == 1) {
                    int remainder = int1 % int2;
                    System.out.println("The quotient is: " + (int1 / int2) + " with remainder: " + remainder);
                    System.out.println("Do you want to use the calculation again(yes/no)");
                    response = input.nextLine();

                }

                else if (type == 2) {
                    double divisor = int1;
                    double dividend = int2;
                    double quotient = divisor / dividend;
                    System.out.println("The quotient is: " + quotient);
                    System.out.println("Do you want to use the calculation again(yes/no)");
                    response = input.nextLine();

                }

                else {
                    System.out.println("Invalid response");
                }

            } else {
                System.out.println("Invalid response");
            }

        }
        // comparing two strings
        // if varname.equals("string name")

    }

}
