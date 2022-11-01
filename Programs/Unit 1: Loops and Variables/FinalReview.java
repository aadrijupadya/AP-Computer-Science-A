package Programs;

// import java.util.*;

public class FinalReview {
    public static void main(String[] args) {
        int cnt = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt);
                cnt++;
            }
            System.out.println();

        }
    }

}