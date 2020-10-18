package ru.geekbrains.lesson02;

import java.util.Arrays;

public class Task04 {

    public static void main(String[] args) {

        int [] arr = {-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, -14};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse (int [] arr) {

        int a = 0;
        for (int i=0; i<arr.length/2; i++){
            a=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=a;
        }
    }
}
