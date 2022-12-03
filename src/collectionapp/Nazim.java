package collectionapp;

import java.util.ArrayList;
public class Nazim {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        // добавим в список ряд элементов
        states.add("Дагестан");
        states.add("Россия");
        states.add("Япония");
        states.add("Италия");
        states.add("Узбекистан");
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Дагестан")){

            System.out.println("Список содержит государство Дагестан");
        }

        // удалим несколько объектов
        states.remove("Дагестан");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    }
}
