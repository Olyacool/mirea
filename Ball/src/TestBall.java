import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(5, "Синий");
        Ball b2 = new Ball(6,"красный");
        b1.setSize(4);
        System.out.println(b1);
        System.out.println(b2);
    }
}
