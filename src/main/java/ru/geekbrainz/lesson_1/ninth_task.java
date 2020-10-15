package ru.geekbrainz.lesson_1;

public class ninth_task {
    public static void main(String[] args) {

        int [] intArr = {1, 2, 3, 4, -5, 6, -7, 8, 9, -10};
        int i;
        int max;
        int min;
        max = intArr[1];
        min = intArr[1];
        for (i=0; i<10; i++){
            if (max<intArr[i]){
                max=intArr[i];
            }
            if (min>intArr[i]){
                min=intArr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
