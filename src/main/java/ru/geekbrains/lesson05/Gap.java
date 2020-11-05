package ru.geekbrains.lesson05;

public class Gap extends Obstacle {

    private final double value;
    public Gap(String name, double value) {
        super(name);
        this.value = value;
    }
    public boolean canPass (Participant participant) {
        if (participant instanceof AbleToFly) {
            AbleToFly ableToFly = (AbleToFly) participant;
            boolean result = ableToFly.getFlying_length() >= value;
            System.out.printf("Участник %s %s перелетел пропасть длиной %f%n",
                    participant.getName(), result ? "" : "не", value);
            return result;
        }
        return false;
    }
}
