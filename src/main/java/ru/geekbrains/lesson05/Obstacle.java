package ru.geekbrains.lesson05;

public abstract class Obstacle {

    private String name;

    public Obstacle (String name) {
        this.name = name;
    }

    public abstract boolean canPass (Participant participant);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
