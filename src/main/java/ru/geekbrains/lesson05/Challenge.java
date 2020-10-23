package ru.geekbrains.lesson05;

public class Challenge {

    public static void main(String[] args) {

        Competition competition = new Competition(
                new Participant[] {
                        new Cat("Kitty", 1.5,555),
                        new Cat("Snow",  2.5, 333),
                        new Cat("Jack",  2, 444),
                        new Human("Kate", 1.7, 522, 50),
                        new Robot("R2D2",  855),
                        new Bird("Lucky", 1000),
                        new Fish("Wetty", 500)
                },
                new Obstacle[] {
                        new Wall( "wall1", 1.3),
                        new Wall("wall2", 1.5),
                        new Wall("wall3", 2.5),
                        new Treadmill("Trd1", 200),
                        new Treadmill("Trd2", 600),
                        new Gap("Gap1", 5),
                        new Pool("pool1", 30)
                }
        );

        //competition.compete();
        Cat cat1 = new Cat ("test", 1.5, 555);
        cat1.jump();
    }
}
