package ru.geekbrainz.lesson_1;

import java.util.Arrays;

public class Fifth_task {

    public static void main(String[] args) {
        int [] intArr = {0, 1, 0, 0, 1, 1, 0};
        System.out.println(Arrays.toString(intArr));
        byte i;
        for (i=0; i<7; i++) {
            if (intArr[i] == 0) {
                intArr[i] = 1;
            } else {
                intArr [i] = 0;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}
