package ru.geekbrainz.lesson_1;

import java.util.Arrays;

public class eighth_task {
    public static void main(String[] args) {

        int i, j;
        int[][] intArr = new int[5][5];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)
                if (j == i) {
                    intArr[i][j] = 1;
                }
        }
    }

    public static void printArr(int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                System.out.print(intArr[i][j]);
            }
        }
    }
}