package PC.BuildMyPC;

public class Dimension {

    private double height;
    private double width;
    private double depth;

    public Dimension(double height, double width, double depth){
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Dimension(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
}
