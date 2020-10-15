package ru.geekbrainz.lesson_1;

public class third {

    public static void main(String[] args) {
        byte a = 10;
        System.out.println(check(a));
    }

    public static boolean check(byte a) {

        if (a<0) {
            return true;
            //System.out.println("true");
        } else {
            return false;
            //System.out.println("false");
        }
    }
}