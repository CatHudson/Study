package ru.geekbrainz.lesson_1;

import java.util.Arrays;

public class Seventh_task {
    public static void main(String[] args) {

        byte i;
        int [] intArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(intArr));
        for (i=0; i<12; i++) {
            if (intArr[i]<6) {
                intArr[i]*=2;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}