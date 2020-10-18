package ru.geekbrains.lesson03;

import java.util.Arrays;

public class check {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John Snow", "js@gmail.com", "PM", 27);
        Employee emp2 = new Employee("Jackie Smith", "js@gmail.com", "Dev", 23);

//        System.out.println(emp1.info());
//        System.out.println(emp2.info());
        Employee [] arr = {emp1, emp2, emp1, emp2, emp1, emp2, emp1, emp2, emp1, emp2};

        Group grp1 = new Group("Project1", arr);
        //System.out.println(grp1.info());
        //System.out.println(grp1.info();
        grp1.EmpsInfo();


    }
}
