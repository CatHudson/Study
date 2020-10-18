package ru.geekbrains.lesson02;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {

        int [] arr =  {1, 2, 3, 2, 1, 2, 4, 5, -2, -3, 6, 19};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort (int[] arr) {

        int b=arr[0], min=arr[0];
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                min = arr[j];
                if (arr[j]<=min){
                    min=arr[j];
                }
            if (arr[i]>=min){
                b=arr[i];
                arr[i]=min;
                arr[j]=b;
                }
            }
        }
    }
}
