package ru.geekbrains.lesson02;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        mix(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mix (int [] arr) {
        Random rnd= new Random();
        for (int i=0; i<arr.length; i++ ) {
            int j = rnd.nextInt(arr.length);
            int x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
        }
    }
}