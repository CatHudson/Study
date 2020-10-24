package ru.geekbrains.lesson05;

public class Cat extends Participant implements AbleToJump, AbleToRun {

    private final double jump_height;
    private final double running_length;

    public Cat(String name, double jump_height, double running_length) {
        super(name);
        this.jump_height = jump_height;
        this.running_length = running_length;
    }

    @Override
    public double getJump_height() {
        return jump_height;
    }

    @Override
    public double getRunning_length() {
        return running_length;
    }
}
