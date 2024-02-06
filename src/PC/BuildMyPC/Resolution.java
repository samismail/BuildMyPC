package PC.BuildMyPC;

public class Resolution {
    private int height;
    private int width;

    public Resolution(int height, int width){
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return height + " x " + width;
    }
}
