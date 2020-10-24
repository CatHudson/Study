package ru.geekbrains.lesson05;

public class Wall extends Obstacle {

    private final double value;

    public Wall(String name, double value) {
        super(name);
        this.value = value;
    }

    public boolean canPass(Participant participant) {
        if (participant instanceof AbleToJump) {
            AbleToJump ableToJump = (AbleToJump) participant;
            boolean result = ableToJump.getJump_height() >= value;
            System.out.printf("Участник %s %s перепрыгнул стену высотой %f%n",
                    participant.getName(), result ? "" : "не", value);
            return result;
        }
        return false;
    }
}
