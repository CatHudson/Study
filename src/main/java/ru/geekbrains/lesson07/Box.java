package ru.geekbrains.lesson07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Friut> {

    private List<T> list = new ArrayList<>();

    public void add(T... fruits) {
        list.addAll(Arrays.asList(fruits));
    }

    public double getWeight() {
        double weight = 0;
        for (T fruit : list) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare (Box<?> box) {
        return  this.getWeight() == box.getWeight();
    }

    public void moveTo (Box<T> box) {
       box.add(list.toArray((T[]) new Object()));
       list.clear();
    }
}
