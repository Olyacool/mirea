import java.lang.*;
public class Ball {
    private int size;
    private String color;

    public int getSize() {
        return size;
    }

    public Ball(int g, String a){
        size = g;
        color = a;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Размер мяча: " + size + ", его цвет: " + color;
    }
}
