package Lesson10;

public class Main {
    public static void main(String[] args) throws Exception {
        ExceptionsExample exceptionsExample = new ExceptionsExample();
        MyException myException = new MyException();
        myException.printStackTrace();
        exceptionsExample.runtimeException();
        exceptionsExample.arithmeticException();
        exceptionsExample.myNullPointerException();
        exceptionsExample.indexOutOfBoundsException();
        exceptionsExample.inputMismatchException();
        exceptionsExample.error();
    }
}


