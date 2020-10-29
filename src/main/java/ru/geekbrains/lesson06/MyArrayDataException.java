package ru.geekbrains.lesson06;

public class MyArrayDataException extends Exception {

    private int i;
    private int j;
    public MyArrayDataException(int i, int j) {
        super(String.format("Недопустимый формат ячейки [%d][%d]", i, j));
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
