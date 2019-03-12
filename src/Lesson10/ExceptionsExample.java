package Lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {
    private ABC abc;

    public void arithmeticException() {
        try {
            int a = 0;
            int b = 5;
            int c = 0;
            c = b / a;
        } catch (ArithmeticException e) {
            System.out.print("ArithmeticException. НЕ ДЕЛАЙ ТАК - НЕ ДЕЛИ НА НОЛЬ");
        } finally {
            System.out.println(", красавчик");
        }
    }

    public void nullPointerException() {
        try {
            abc.show();
        } catch (NullPointerException e) {
            System.out.println("dsgf");
        }
    }

    public void myNullPointerException() {
        try {
            throw new NullPointerException("My Exception");
        } catch (NullPointerException e) {
            System.out.println("My NullPointer");
        }
    }

    public void indexOutOfBoundsException() {
        try {
            int[] arr = {1, 2, 3, 4};
            arr[5] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException. Вылез за границу массива");
        }
    }

    public void inputMismatchException() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("The number entered is " + number);
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect input: an integer is required");
        }
    }

    public void runtime() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            System.exit(0);
        } finally {
            System.out.println("Please, let me print this.");
        }
    }

    public void error() {
        try {
            Object x = null;
        } catch (Error error) {
            throw new Error();
        }
    }

    public void runtimeException() throws Exception {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
    }
}