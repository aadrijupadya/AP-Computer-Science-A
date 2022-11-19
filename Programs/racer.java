public class racer {
    private String gender;
    private int time;

    public racer(String g, int t) {
        gender = g;
        time = t;
    }

    public String getGender() {
        return gender;
    }

    public int getTime() {
        return time;
    }

    public void setGender(String g) {
        gender = g;
    }

    public void setTime(int t) {
        time = t;
    }

    public String toString() {
        return "(" + time + "," + gender + ")";
    }

}
