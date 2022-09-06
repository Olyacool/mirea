package ru.mirea.gibo02.isaev;
import java.lang.*;
public class First {
    public static void main(String[] args) {
        System.out.println("Hello world, \ni like sandwiches");
        /*
        int a, b, c;
        a = 13;
        b = 14;
        c = a + b;
        System.out.println("c = " + c + " This is string");
        */
        Rectangle p1=new Rectangle(19,67);
        System.out.println(p1);

        p1.setA(66); p1.setB(62);
        System.out.println(p1);
        int g= p1.getA()* p1.getB();
        System.out.println("Ploshad = " + g);


        System.out.println("Ploshad ravnyaetsa \t " +  p1.getArea());
        Circle p2=new Circle(100);
        System.out.println(p2);

        System.out.println("Ploshad cruga = \t" + p2.getWare());
    }

}
