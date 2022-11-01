package Programs;

public class Test {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 2;
        for (int i = 1; i < 8; i++) {
            a += b;
            b++;
            if (b % 2 == 0)
                b += 3;

        }
        System.out.println(a + " " + b);

    }

}
