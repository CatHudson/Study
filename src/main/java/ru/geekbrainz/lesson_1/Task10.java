package ru.geekbrainz.lesson_1;

public class Task10 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2021));
    }

    public static boolean isLeapYear (int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
