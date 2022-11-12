package twentyfigures;
import java.awt.geom.Ellipse2D;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Circle extends Ellipse2D {


    private Point point;
    private double width;
    private double height;
    public Circle() {
    point = new Point();
    }

    public Circle(double i, double v, double i1, double v1) {

    }

    public void Circle(double x, double y, double width, double height) {
        point = new Point();

        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle2D getBounds2D(){
        return null;
    }

    @Override
    public double getHeight() {

        return height;
    }

    @Override
    public double getWidth() {

        return width;
    }
    @Override
    public double getX() {

        return point.getX();
    }
    @Override
    public double getY() {

        return point.getY();
    }
    @Override
    public boolean isEmpty() {

        return false;
    }
    @Override
    public void setFrame(double x, double y, double width, double height) {
    point.setLocation(x, y);
    this.width = width;
    this.height = height;
    }
}
