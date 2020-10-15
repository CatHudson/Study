package ru.geekbrains.lesson02;

public class Task03 {
    public static void main(String[] args) {

        int secs = 5640;
        System.out.println(convert(secs));
    }
    public static String convert (int secs){

        int h = secs/60/60%60;
        String hours, minutes, seconds;
        if (h<10){
            hours = "0" + String.valueOf(h);
        } else {
            hours = String.valueOf(h);
        }
        int m = secs/60%60;
        if (m<10){
            minutes = "0" + String.valueOf(m);
        } else {
            minutes = String.valueOf(m);
        }
        int s = secs%60;
        if (s<10){
            seconds = "0" + String.valueOf(s);
        } else {
            seconds = String.valueOf(s);
        }
        return ("Time: " + hours + ":" + minutes + ":" + seconds);
    }
}