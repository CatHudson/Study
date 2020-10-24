package ru.geekbrains.lesson05;

public class Human extends Participant implements AbleToSwim, AbleToRun, AbleToJump {

    private final double jump_height;
    private final double running_length;
    private final double swimming_length;

    public Human(String name, double jump_height, double running_length, double swimming_length) {
        super(name);
        this.jump_height = jump_height;
        this.running_length = running_length;
        this.swimming_length = swimming_length;
    }

    @Override
    public double getJump_height() {
        return jump_height;
    }

    @Override
    public double getRunning_length() {
        return running_length;
    }

    @Override
    public double getSwimming_length() {
        return swimming_length;
    }
}
