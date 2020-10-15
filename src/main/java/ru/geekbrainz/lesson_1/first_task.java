package ru.geekbrainz.lesson_1;

public class first_task {

    public static void main(String[] args) {
        byte a = 5;
        byte b = 6;
        //System.out.println("For a = " + a "and b= " + b "we get " sum(a, b));
    }
        public static boolean sum (byte a, byte b){

            if ((a + b <= 10) && (a + b >= 20)) {
                return false;
            } else {
                return true;
            }
       /* byte a=5, b=6;
        if ((a+b>=10) & (a+b<=20)) {
            System.out.println("true");;
        } else {
            System.out.println("false");
        }*/
        }
}