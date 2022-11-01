package Programs;

public class ArrayHelper {
    public static void display(int[] a) {
        System.out.println();
        for (int temp : a) {

            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static int[] addMid(int[] a, int b) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];

        }

        result[a.length] = b;

        return result;

    }

    public static int[] removeMid(int[] a) {
        int[] result = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            result[i] = a[i];

        }

        return result;

    }

    public static int[] reverseArray(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[a.length - i - 1];

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

    public static boolean existsinArray(int[] a, int b) {
        boolean exists = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b)
                exists = true;

        }

        return exists;
    }

    public static int numberOf(int[] a, int b) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b)
                cnt++;
        }

        return cnt;
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

}
