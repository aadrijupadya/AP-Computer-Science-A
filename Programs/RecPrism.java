public class RecPrism extends rectangle {
    private int height;

    public RecPrism() {
        super();
        height = 3;
    }

    public RecPrism(int l, int w, int h) {
        super(l, w);
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public int volume() {
        return getLength() * super.getWidth() * height;
    }

}
