package ru.geekbrains.lesson06;

public class MyArraySizeException extends Exception {

    private int length;
    private int ix;

    public MyArraySizeException(int ix, int length) {
        super(String.format("Недопустимая размерность подмассива %d - [%d]", ix, length)) ;
        this.length = length;
    }

    public MyArraySizeException(int length) {
        super(String.format("Недопустимая размерность массива [%d]", length));
    }

    public int getLength() {
        return length;
    }

    public int getIx() {
        return ix;
    }
}
