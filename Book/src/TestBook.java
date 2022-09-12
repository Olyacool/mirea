import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book e1 = new Book("научная","Питер Пэн",500);
        Book e2 = new Book("математическая","Математический анализ", 345);
        System.out.println(e1);
        System.out.println(e2);
    }
}