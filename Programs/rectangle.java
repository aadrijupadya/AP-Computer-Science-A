public class rectangle {
    private int width;
    private int length;

    public rectangle() {
        length = 1;
        width = 2;

    }

    public rectangle(int w, int l) {
        width = w;
        length = l;

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setLength(int h) {
        length = h;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return (2 * (length + width));
    }

    public boolean isSquare() {
        return length == width;
    }

    public String toString() {
        return "the length and width are " + length + " x " + width;
    }

}
