package ru.geekbrains.lesson06;

import static ru.geekbrains.lesson06.Array.sumArr;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String [][] arr = new String[4][4];
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                arr[i][j] = "1";
            }
        }
        arr[3][3] = "sdf";
        sumArr(arr);
        String[][] arr1 = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr1[i][j] = "1";
            }
        }
        sumArr(arr);
    }
}
