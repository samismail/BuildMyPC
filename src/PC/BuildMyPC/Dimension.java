package PC.BuildMyPC;

public class Dimension {

    private double height;
    private double length;
    private double depth;

    public Dimension(double height, double length, double depth){
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
