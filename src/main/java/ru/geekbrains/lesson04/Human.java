package ru.geekbrains.lesson04;

public class Human extends Participant {
    public Human(String name, double jump_height, double running_length) {
        super(name, jump_height, running_length);
    }

    /*private String name;
    private double jump_height;
    private double running_length;

    public Human (String name, double jump_height, double running_length) {
        this.name = name;
        this.jump_height = jump_height;
        this.running_length = running_length;
    }

    public String run (double distance) {
        if (distance > running_length) {
            return ("The participant did not succeed in running");
        } else {
            return ("The participant completed the running challenge");
        }
    }

    public String jump (double height) {
        if (height > jump_height) {
            return ("The participant did not jump high enough");
        } else {
            return ("The participant did jump successfully");
        }
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
    }*/
}
