package ru.geekbrains.lesson05;

public class Pool extends Obstacle {

    private final double value;
    public Pool(String name, double value) {
        super(name);
        this.value = value;
    }

    public boolean canPass (Participant participant) {
        if (participant instanceof AbleToSwim) {
            AbleToSwim ableToSwim = (AbleToSwim) participant;
            boolean result = ableToSwim.getSwimming_length() >= value;
            System.out.printf("Участник %s %s переплыл бассейн длиной %f%n",
                    participant.getName(), result ? "" : "не", value);
            return result;
        }
        return false;
    }
}
