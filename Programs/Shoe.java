package Programs;

public class Shoe { // variable type creation
    // attributes
    private int size;
    private String color;

    // constructors
    // default
    public Shoe() {
        size = 7;
        color = "white";
    }

    // custom
    public Shoe(int s, String c) {
        size = s;
        color = c;
    }

    // getters
    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    // setter
    public void setSize(int s) {
        size = s;
    }

    public void setColor(String c) {
        color = c;
    }

}
