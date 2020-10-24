package ru.geekbrains.lesson05;

public class Bird extends Participant implements AbleToFly {

    private final double flying_length;
    public Bird(String name, double flying_length) {
        super(name);
        this.flying_length = flying_length;
    }

    @Override
    public double getFlying_length() {
        return flying_length;
    }
}
