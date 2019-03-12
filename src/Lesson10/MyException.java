package Lesson10;

public class MyException extends Exception {
    private int detail;
    MyException(int a) {
        detail = a;
    }

    public MyException() {

    }

    public String toString() {
        return "Stankevych Exception!";
    }
}
