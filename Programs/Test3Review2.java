import java.util.*;

public class Test3Review2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String a = input.nextLine();
        System.out.println(Convert(VowelSplit(a)));
        input.close();
    }

    public static void Display(String[] arr) {
        for (String t : arr) {
            System.out.print(t + " ");

        }
    }

    public static ArrayList<String> Convert(String[] arr) {
        ArrayList<String> list = new ArrayList<String>();
        for (String t : arr) {
            list.add(t);
        }
        return list;
    }

    public static String[] VowelSplit(String a) {
        String[] split = new String[a.length()];
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if (!((a.substring(i, i + 1).equals("A")) || (a.substring(i, i + 1).equals("E"))
                    || (a.substring(i, i + 1).equals("I")) || (a.substring(i, i + 1).equals("O"))
                    || (a.substring(i, i + 1).equals("U")))) {
                split[cnt] = a.substring(i, i + 1);
                cnt++;
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (((a.substring(i, i + 1).equals("A")) || (a.substring(i, i + 1).equals("E"))
                    || (a.substring(i, i + 1).equals("I")) || (a.substring(i, i + 1).equals("O"))
                    || (a.substring(i, i + 1).equals("U")))) {
                split[cnt] = a.substring(i, i + 1);
                cnt++;
            }
        }
        return split;
    }

}
