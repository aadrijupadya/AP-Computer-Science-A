 

public class StringCommands {
    public static void shiftLeft(int[] arr) {
        int[] shifted = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            shifted[i] = arr[i + 1];

        }
        shifted[arr.length - 1] = arr[0];
        for (int temp : shifted) {
            System.out.print(temp + " ");
        }

    }

    public static void Insert(String str1, String str2, int pos) {
        String first = str1.substring(0, pos);
        String last = str1.substring(pos);
        System.out.println(first + str2 + last);

    }

    public static void main(String[] args) {
        // int[] arr = { 1 };
        // shiftLeft(arr);
        Insert("xy", "cat", 2);

    }

}
