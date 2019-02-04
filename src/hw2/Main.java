package hw2;

/**
 * Переделать калькулятор: добавить switch/case для (+,-,/,*), а также значения a, b вводить с клавиатуры.
 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        calculator.operations();
    }
}
