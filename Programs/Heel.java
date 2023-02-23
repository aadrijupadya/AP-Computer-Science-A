public class Heel extends Shoe {
    // attributes, //size, color, height
    private int height;

    // constructors
    // 7, white, 3
    public Heel() {
        // super before private attribute
        super();
        height = 3;
    }

    public Heel(int s, String c, int h) {
        super(s, c);
        this.height = h;
    }

    // getters
    public int getHeight() {
        return height;
    }

    // setters
    public void setHeight(int height) {
        this.height = height;
    }
    // custom methods

}
