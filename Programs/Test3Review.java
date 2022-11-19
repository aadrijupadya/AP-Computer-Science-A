
import java.util.*;

public class Test3Review {
    public static void main(String[] args) {
        System.out.println(SuperAdder(2147483647, 5678));

    }

    public static int SuperAdder(int a, int b) {
        int sum = 0;
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        while (a > 0) {
            num1.add(a % 10);
            a /= 10;
        }
        System.out.println(num1);
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        while (b > 0) {
            num2.add(b % 10);
            b /= 10;
        }
        System.out.println(num2);
        for (int i = 0; i < num1.size(); i++) {
            sum += (num1.get(i) * Math.pow(10, i));

        }
        for (int j = 0; j < num2.size(); j++) {
            sum += (num2.get(j) * Math.pow(10, j));

        }

        return sum;
    }


    

}
