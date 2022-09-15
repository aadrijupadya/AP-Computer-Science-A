import java.util.*;

public class Calculation {
    public static void main(String[] args) {
        System.out.println(
                "This program calculates and returns the midpoint, distance, and equation of line given the points x1, x2, y1, y2");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1");
        double x1 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter y1");
        double y1 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter x2");
        double x2 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter y2");
        double y2 = input.nextDouble();
        input.nextLine();
        System.out.println("Distance: " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("Midpoint: (" + ((x2 + x1) / 2) + "," + ((y2 + y1) / 2) + ")");
        double slope = (y2 - y1) / (x2 - x1);
        double b = y1 - (slope * x1);
        System.out.println("Equation of line: y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + b);
        // System.out.println(5 % 3);
        // double + int = double
        // Math module to run math functions
        // decimals round weirdly in java
        // Ints round decimals/doubles down (truncates)

    }
}
