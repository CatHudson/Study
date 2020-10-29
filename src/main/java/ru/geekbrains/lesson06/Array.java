package ru.geekbrains.lesson06;

import javax.crypto.IllegalBlockSizeException;

public class Array {

    public static void sumArr (String [][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException(arr.length);
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException(i, arr[i].length);
            }
        }
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }

//

//    public String[][] getArr() {  public void arrSum (String [][] arr) throws MyArraySizeException, MyArrayDataException {
////        int sum = 0;
////        if (arr[0].length == 4 && arr.length == 4) {
////            for (int i = 0; i<4; i++) {
////                for (int j = 0; j < 4; j++) {
////                    try {
////                        sum += Integer.parseInt(arr[i][j]);
////                        throw new MyArrayDataException("Недопустимый тип данных в ячейке " + arr[i][j]);
////                    } catch (MyArrayDataException e) {
////                        throw e;
////                    } finally {
////                        System.out.println("Array sum = " + sum);
////                    }
////                }
////            }
////        } else {
////            throw new MyArraySizeException("Недопустимый размер массива");
////        }
////    }
//        return arr;
//    }
//
//    public void setArr(String[][] arr) {
//        this.arr = arr;
//    }

}
