import java.util.*;

public class AL {
    public static void main(String[] args) {
        Integer f = 5;
        System.out.println(f);
        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(5);
        aa.add(23);
        System.out.println(aa.get(1));
        aa.add(1, 8);
        aa.remove(2);
        aa.set(1, 30);
        System.out.println(aa.size());
        for (int temp : aa) {
            System.out.println(temp + " ");
        }
    }
}
