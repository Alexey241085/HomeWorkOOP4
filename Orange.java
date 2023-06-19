package ru.geekbrains.lesson4.homework;

public class Orange extends  Fruit{



    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return String.format("вес апельсина 1.5");
    }
}
