package ru.geekbrains.lesson05;

public class Bird extends Participant implements AbleToFly {
    public Bird(String name, double flying_length) {
        super(name, 0, 0, 0, flying_length);
    }
    public void fly () {

    }
}
