import java.lang.*;
public class Parrot {
    private int weight;
    private String color;
    private String poroda;

    public int getWeight() {
        return weight;
    }

    public Parrot(int g, String a, String p){
        weight = g;
        color = a;
        poroda = p;
    }

    public void setWeight(int size) {
        this.weight = size;
    }

    @Override
    public String toString() {
        return "Попугай породы: " + poroda + " весом в " + weight + " грамм" + ", его цвет: " + color;
    }
}
