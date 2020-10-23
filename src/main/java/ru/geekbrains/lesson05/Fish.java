package ru.geekbrains.lesson05;

public class Fish extends Participant implements AbleToSwim {
    public Fish(String name, double swimming_length) {
        super(name, 0, 0, swimming_length, 0);
    }

    public void swim() {

    }
}
