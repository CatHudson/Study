package ru.geekbrainz.lesson_1;

import java.util.Arrays;

public class eighth_task {

    public static void main(String[] args) {
        int[][] intArr = new int[5][5];
        fillDiags(intArr);
        System.out.println(Arrays.deepToString(intArr));
    }

    public static void fillDiags(int[][] intArr) {
        for (int i=0; i<intArr.length; i++) {
            for (int j=0; j < intArr[i].length; j++) {
                if (i == j || i == intArr[i].length - j -1) {
                    intArr[i][j] = 1;
                }
            }
        }
    }
}