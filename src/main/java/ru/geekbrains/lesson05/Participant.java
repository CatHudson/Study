package ru.geekbrains.lesson05;

public abstract class Participant {

    private String name;
    private double jump_height;
    private double running_length;
    private double swimming_length;
    private double flying_length;

    public Participant (String name, double jump_height, double running_length, double swimming_length, double flying_length) {
        this.name = name;
        this.jump_height = jump_height;
        this.running_length = running_length;
        this.swimming_length = swimming_length;
        this.flying_length = flying_length;
    }

    public double getSwimming_length() {
        return swimming_length;
    }

    public void setSwimming_length(double swimming_length) {
        this.swimming_length = swimming_length;
    }

    public double getFlying_length() {
        return flying_length;
    }

    public void setFlying_length(double flying_length) {
        this.flying_length = flying_length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJump_height() {
        return jump_height;
    }

    public void setJump_height(double jump_height) {
        this.jump_height = jump_height;
    }

    public double getRunning_length() {
        return running_length;
    }

    public void setRunning_length(double running_length) {
        this.running_length = running_length;
    }
}
