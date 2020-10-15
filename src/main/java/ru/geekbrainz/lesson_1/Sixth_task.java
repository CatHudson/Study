package ru.geekbrainz.lesson_1;

import java.util.Arrays;

public class Sixth_task {
    public static void main(String[] args) {

        byte i;
        byte j = -1;
        int [] intArr = new int [8];
        for (i=0; i<8; i++) {
            intArr[i] = (j+3);
            j += 3;
        }
        System.out.println(Arrays.toString(intArr));
    }
}
