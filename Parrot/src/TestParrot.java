import java.lang.*;
public class TestParrot {
    public static void main(String[] args){
        Parrot p1 = new Parrot(700, "зелёный", "волнистый");
        Parrot p2 = new Parrot(800, "сине-жёлтый", "ара");
        p1.setWeight(400);
        System.out.println(p1);
        System.out.println(p2);
    }
}

