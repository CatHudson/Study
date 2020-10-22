package ru.geekbrains.lesson05;

public class Treadmill extends Obstacle {

    private final double value;
    public Treadmill(String name, double value) {
        super(name);
        this.value = value;
    }
    public boolean canPass (Participant participant) {
        boolean result = participant.getRunning_length() >= value;
        System.out.printf("Участник %s %s пробежал дорожку длиной %f%n",
                participant.getName(), result ? "" : "не", value);
        return result;
    }
}
