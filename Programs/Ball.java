
import java.util.*;
public class Ball extends Sports {
    private double radius;

    public Ball() {
        super();
        radius = 4.5;
    }

    public Ball(String sport, int numFans, double radius) {
        super(sport,numFans);
        this.radius = radius;
    }

  

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Boolean largeSport() {
        if  (super.getFans() > 100) {
            return true;
        }
        return false;
    }

    public Boolean isBig() {
        if (radius > 10) {
            return true;
        }
        return false;
    }
    public ArrayList<Integer> storeInts(int a,int b) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(a);
        arr.add(b);
        return arr;
    }



    
}
