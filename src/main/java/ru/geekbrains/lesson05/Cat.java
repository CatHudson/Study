package ru.geekbrains.lesson05;

public class Cat extends Participant implements AbleToJump, AbleToRun {
    public Cat(String name, double jump_height, double running_length) {
        super(name, jump_height, running_length, 0, 0);
    }

    public void jump () {
        System.out.println("Прыгнул");
    }

    public void run() {

    }

}
