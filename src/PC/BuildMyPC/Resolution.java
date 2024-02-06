package PC.BuildMyPC;

public class Resolution {
    private double height;
    private double width;

    public Resolution(int height, int width){
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return height + " x " + width;
    }
}
