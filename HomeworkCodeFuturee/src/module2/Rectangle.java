package module2;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
class Parallelepiped extends Rectangle {
    private double height;

    public Parallelepiped(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double calculateArea() {

        return 2 * (length * width + length * height + width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

