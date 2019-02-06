package hw2;

/**
 * Переделать калькулятор: добавить switch/case для (+,-,/,*), а также значения a, b вводить с клавиатуры.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую цифру:");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите операцию (+, -, / или *):");
        String operation = reader.readLine();
        System.out.println("Введите вторую цифру:");
        int b = Integer.parseInt(reader.readLine());
        System.out.println(calculator.operations(a, b, operation));
        reader.close();
    }
}
