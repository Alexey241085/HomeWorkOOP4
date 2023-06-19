package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public static boolean compare(ArrayList<?> o1, ArrayList<?> o2){
            float resWeigh1 = 0;
            for (int i = 0; i < o1.size(); i++) {
                if (o1.get(i) instanceof Apple){
                   resWeigh1 = o1.size();
                }
                if (o1.get(i) instanceof Orange){
                    resWeigh1 = (float) (1.5*o1.size());
                }
            }
            float resWeigh2 = 0;
            for (int i = 0; i < o2.size(); i++) {
                if (o2.get(i) instanceof Apple){
                    resWeigh2 = o2.size();
                }
                 if (o2.get(i) instanceof Orange){
                    resWeigh2 = (float) (1.5*o2.size());
                }
            }

                if (resWeigh1 == resWeigh2){
                    System.out.print("коробки равны: ");
                    return  true;
                }
                else
                    System.out.print("коробки равны: ");
                    return false;

     }
}


