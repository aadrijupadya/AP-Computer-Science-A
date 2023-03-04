import java.util.ArrayList;
import java.util.Arrays;
public class Hanoi{
    public static void tow(int a, String pos1, String pos2){
        ArrayList<String> s = new ArrayList<>(Arrays.asList("A","B","C"));
        if(a == 1){
            System.out.println("Move disk 1 from " + pos1 + " to " + pos2);
        } else{
            s.remove(pos1);
            s.remove(pos2);
            tow(a-1,pos1,s.get(0));
            System.out.println("Move disk " + a + " from " + pos1 + " to " + pos2);
            tow(a-1, s.get(0),pos2);
        }
    }

    public static void main(String[] args) {
        tow(4,"A","C");
    }
}