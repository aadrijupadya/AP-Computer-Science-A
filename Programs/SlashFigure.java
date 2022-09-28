package Programs;

public class SlashFigure {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i += 2) {
            for (int j = 1; j <= 22; j++) {
                if (j <= i)
                    System.out.print("\\");
                else if (j > (22 - i))
                    System.out.print("/");

                else
                    System.out.print("!");

            }
            System.out.println();
        }
    }
}