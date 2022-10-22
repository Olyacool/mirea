package pack;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimetr() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
