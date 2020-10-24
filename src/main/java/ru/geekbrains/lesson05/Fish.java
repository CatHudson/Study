package ru.geekbrains.lesson05;

public class Fish extends Participant implements AbleToSwim {

    private final double swimming_length;

    public Fish(String name, double swimming_length) {
        super(name);
        this.swimming_length = swimming_length;
    }

    @Override
    public double getSwimming_length() {
        return swimming_length;
    }
}
