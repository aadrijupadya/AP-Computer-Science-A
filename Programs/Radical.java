import java.util.*;

public class Radical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            System.out.println("Please input a number to find the square root");
            int a = input.nextInt();
            input.nextLine();
            if (Square(a)) {
                System.out.println(sqrt(a));

            } else {
                Pull(Factorize(a), a);
            }
            System.out.println("Would you like to continue?");
            String response = input.nextLine();
            if (response.equals("No")) {
                cont = false;
            }
        }
        input.close();
    }

    public static boolean Prime(int n) {
        for (int i = n; i >= 2; i--) {
            boolean isPrime = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                return true;
            }

        }
        return false;
    }

    public static boolean Square(int a) {
        for (int i = a; i >= 2; i--) {
            if ((i * i) == a) {
                return true;
            }
        }
        return false;
    }

    public static int sqrt(int a) {
        int root = 0;
        for (int i = a; i >= 2; i--) {
            if ((i * i) == a) {
                root = i;

            }
        }

        return root;
    }

    public static int Mult(ArrayList<Integer> aa) {
        int product = 1;
        for (int i = 0; i < aa.size(); i++) {
            product *= (aa.get(i));
        }
        return product;
    }

    public static void Pull(ArrayList<Integer> aa, int a) {
        int cnt = 0;
        ArrayList<Integer> bb = new ArrayList<Integer>();
        for (int i = 0; i < aa.size() - 1; i++) {
            if (Square(aa.get(i) * aa.get(i + 1))) {
                bb.add(aa.get(i));
                aa.remove(i);
                aa.remove(i);
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("root " + a);
        } else {
            System.out.println(Mult(bb) + " root " + Mult(aa));
        }

    }

    public static ArrayList<Integer> Factorize(int a) {
        ArrayList<Integer> bb = new ArrayList<Integer>();
        boolean loop = true;
        while (loop) {

            ArrayList<Integer> aa = new ArrayList<Integer>();
            for (int i = 0; i <= (a - 1); i++) {
                if (Prime(i) && (a % i == 0)) {
                    aa.add(i);
                }
            }
            if (aa.size() != 0) {
                a = aa.get(aa.size() - 1);
                bb.add(aa.get(0));
            }
            if (aa.size() == 1) {
                bb.add(aa.get(0));
                loop = false;
            }
            if (aa.size() == 0) {
                bb.add(a);
                loop = false;
            }

        }
        return bb;

    }

}
