package ru.geekbrains.lesson05;

public abstract class Participant {

    private String name;

    public Participant (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
