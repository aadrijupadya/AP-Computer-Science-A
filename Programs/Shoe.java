
public class Shoe implements Footwear { // variable type creation
    // attributes
    private int size;
    private String color;
    // private ensures that these variables cannot be accessed without getters
    private Sock sock;

    // constructors
    // default
    public Shoe() {
        size = 7;
        color = "white";
        sock = new Sock();
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

    public Sock getSock() {
        return sock;
    }

    // setter
    public void setSize(int s) {
        size = s;
    }

    public void setColor(String color) {
        this.color = color;
        // differentiates between private variable and variable that is passed in
    }

    public void method1() { // nonstatic methods require creation of a variable of an object before
                                 // initializing
        System.out.println("Nice kicks!");
    }

    // static methods do not require objects, but cannot use anything from object
    // file (getters, setters, variables, etc.)

}
