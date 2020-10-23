package ru.geekbrains.lesson05;

public class Human extends Participant implements AbleToSwim, AbleToRun, AbleToJump {
    public Human(String name, double jump_height, double running_length, double swimming_length) {
        super(name, jump_height, running_length, swimming_length, 0);
    }

    public void jump () {
        System.out.println("Прыгнул");

    }

    public void swim () {

    }

    public void run () {

    }

}
