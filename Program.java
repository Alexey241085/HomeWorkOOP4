package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Program {

    public static float getWeigh(ArrayList<?> listFruit) {
        float resWeigh = 0;
        for (int i = 0; i < listFruit.size(); i++) {
            if (listFruit.get(i) instanceof Apple){
                resWeigh = listFruit.size();
            }
            if (listFruit.get(i) instanceof Orange) {
                resWeigh = (float) (1.5 * listFruit.size());
            }
        }
            System.out.println("Вес коробки " + resWeigh);
        return resWeigh;
    }


    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();


        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        ArrayList<Apple> listApple2 = new ArrayList<>();
        listApple2.add(apple4);
        listApple2.add(apple5);


        ArrayList<Apple> listApple = new ArrayList<>();
        listApple.add(apple1);
        listApple.add(apple2);
        listApple.add(apple3);

        ArrayList<Orange> listOrange = new ArrayList<>();
        listOrange.add(orange1);
        listOrange.add(orange2);
        listOrange.add(orange3);

        ArrayList<Orange> listOrange2 = new ArrayList<>();
        listOrange2.add(orange4);
        listOrange2.add(orange5);


        System.out.println(listApple);
        System.out.println(listOrange);

        getWeigh(listApple);
        getWeigh(listOrange);

        System.out.println(Box.compare(listApple,listOrange));







    }

}

