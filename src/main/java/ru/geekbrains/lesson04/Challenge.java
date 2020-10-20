package ru.geekbrains.lesson04;

public class Challenge {

    public static void main(String[] args) {

        Cat cat1 = new Cat ("Kitty", 1.5,555);
        Cat cat2 = new Cat ("Snow",  2.5, 333);
        Cat cat3 = new Cat ("Jack",  2, 444);
        Human human1 = new Human("Kate", 1.7, 522);
        Robot robot1 = new Robot("R2D2", 0.5, 855);
        Wall wall1 = new Wall (1.8, "Wall");
        Wall wall2 = new Wall (2, "Wall");
        Wall wall3 = new Wall (4.5, "Wall");
        Treadmill treadmill1 = new Treadmill(500, "Treadmill");
        Treadmill treadmill2 = new Treadmill(400, "Treadmill");
        Treadmill treadmill3 = new Treadmill(300, "Treadmill");
        Participant [] participants = {cat1, cat2, cat3, human1, robot1};
        Obstacle [] obstacles = {wall1, wall2, wall3,treadmill1, treadmill2, treadmill3};


        for (int i=0; i<participants.length; i++) {
            for (int j=0; j< obstacles.length; j++) {
               if (obstacles[j].getName() == "Wall") {
                   if (participants[i].getJump_height()>obstacles[j].getValue()){
                       System.out.println(participants[i].getName() + " successfully overcomes the obstacle #" + (j+1));
                   } else {
                       System.out.println("The obstacle #" + (j+1) + " was too hard for " + participants[i].getName() + ". This participant has overcome " + j + " obstacles and is now disqualified.");
                       break;
                   }
               } else {
                   if (obstacles[j].getName() == "Treadmill") {
                       if (participants[i].getRunning_length()>obstacles[j].getValue()) {
                           System.out.println(participants[i].getName() + " successfully overcomes the obstacle #" + (j+1));
                       } else {
                           System.out.println("The obstacle #" + (j+1) + " was too hard for " + participants[i].getName() + ". This participant has overcome " + j + " obstacles and is now disqualified.");
                           break;
                       }
                   }
               }
            }
        }
    }
}
