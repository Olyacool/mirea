package pack;

public class Circle extends Shape {
protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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