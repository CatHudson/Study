package ru.geekbrains.lesson02;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {

        char [][] arr = new char [9][9];
        triangle(arr);
        for (char [] line : arr) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void triangle (char [][] arr){

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr.length; j++){
                arr[i][j] = ' ';
            }
        }
        for (int i =0; i<arr.length/2+1; i++){
            for (int j=i; j<arr.length-i; j++){
                arr[i][j] = '*';
            }
        }
    }
}
