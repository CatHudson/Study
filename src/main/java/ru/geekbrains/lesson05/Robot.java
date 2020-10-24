package ru.geekbrains.lesson05;

public class Robot extends Participant implements AbleToRun {

    private final double running_length;

    public Robot(String name, double running_length) {
        super(name);
        this.running_length = running_length;
    }

    @Override
    public double getRunning_length() {
        return running_length;
    }
}
