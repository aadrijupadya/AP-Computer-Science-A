package Programs;

import java.util.*;

public class ArrayHelper {
    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] addEnd(int[] a, int b) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];

        }

        result[a.length] = b;

        return result;

    }

    public static int[] removeEnd(int[] a) {
        int[] result = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            result[i] = a[i];

        }

        return result;

    }

    public static int[] addMid(int[] a, int b, int loc) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < a.length + 1; i++) {
            if (i < loc - 1)
                result[i] = a[i];
            // if index is before position, add as normal
            else if (i == loc)
                result[i] = b;
            // add element at specified index
            else
                result[i] = a[i - 1];
            // all factors now shifted by 1 because of inserted element

        }

        return result;

    }

    public static int[] removeMid(int[] a, int loc) {
        int[] result = new int[a.length - 1];
        boolean flag = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (i != loc)
                result[i] = a[i];
            else
                flag = true;
            if (flag)
                result[i] = a[i + 1];

        }

        return result;

    }

    public static int[] replace(int[] a, int b, int loc) {
        int[] result = new int[a.length];
        boolean flag = false;
        // boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            if (i != loc)
                result[i] = a[i];
            else {
                result[i] = b;
                flag = true;

            }
            if (flag && (i != loc))
                result[i] = a[i];

        }

        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements do you want to enter in your array?");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the element");
            int input = scanner.nextInt();
            array[i] = input;

        }
        int[] add = new int[length + 1];

        add = addEnd(array, 2);
        System.out.println("Array with new element");
        display(add);

        int[] remove = new int[length - 1];
        remove = removeEnd(array);
        System.out.println("Array with removed element");
        display(remove);

        int[] mid = new int[length + 1];
        mid = addMid(array, 0, 0);
        System.out.println("Array with new element at specified index");
        display(mid);

        int[] remid = new int[length - 1];
        remid = removeMid(array, 2);
        System.out.println("Array with removed element at specified index");
        display(remid);

        int[] replace = new int[length];
        replace = replace(array, 100, 3);
        System.out.println("Array with replaced element at specified index");
        display(replace);

        scanner.close();

    }
}