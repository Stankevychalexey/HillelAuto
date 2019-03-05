package Lesson10;

import java.util.ArrayList;

public class Main {

    void a() throws InterruptedException {
        Thread.sleep(10);
    }

    public static void main(String[] args) {

        // ArithmeticException
        try {
            int a = 0;
            int b = 5;
            int c = 0;
            c = b / a;
        } catch (ArithmeticException e) {
            System.out.print("ArithmeticException e. НЕ ДЕЛАЙ ТАК - НЕ ДЕЛИ НА НОЛЬ");
        } finally {
            System.out.print(", красавчик");
        }
        System.out.println("\n");


        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3, 4};
            arr[5] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException e. Вылез за границу массива");
        }

        // NullPointerException
        try {
            throw new NullPointerException("My Exception");
        } catch (NullPointerException e) {
            System.out.println("caught inside demoproc");
        }

        //

    }
}


