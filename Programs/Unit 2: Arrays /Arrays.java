package Programs;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to add");
        int size = input.nextInt();
        input.nextLine();
        int[] numbers = new int[size];
        // entering elements one by one and strong them in array
        for (int i = 1; i <= size; i++) {

            System.out.println("Enter element " + i + " of the array!");
            int n = input.nextInt();
            input.nextLine();
            numbers[i - 1] = n;

        }

        // for (int j = 0; j < (size - 1); i++) {

        // if (numbers[i] >= numbers[i + 1]) {
        // int temp = numbers[i + 1];
        // numbers[i + 1] = numbers[i];
        // numbers[i] = temp;

        // }

        // }
        boolean swapped = true;
        // bubble sort algorithm
        while (swapped) {
            swapped = false;
            for (int i = 0; i < size - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                    // swapping values

                }
            }

        }
        System.out.println("Sorted array");

        for (int i = 0; i < size; i++) {

            System.out.print(numbers[i] + " ");

        }
        Shoe converse = new Shoe(3, "red");

        input.close();
    }
}
