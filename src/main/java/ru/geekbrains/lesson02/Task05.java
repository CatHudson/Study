package ru.geekbrains.lesson02;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        mix(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mix (int [] arr){

        int min = 0, a=0, c=0;
        int max = arr.length +1;
        double b = 0;
//        double rnd = (Math.random()*((max-min)+1))+min;
//        int c = (int) rnd;
        for (int i=0; i<arr.length-1; i++){
            a=arr[i];
            b = (Math.random()*((max-min)-1)+min);
            c = (int) b;
            arr[i]=arr[c];
            arr[c] = arr[i];
            }
        }
//        for (int i=0; i<arr.length; i++){
//
//        }
    }
