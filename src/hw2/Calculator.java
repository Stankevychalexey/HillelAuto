package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
  public static void main(String[] args) {
  }

  public void operations() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите первое число:");
    int a = Integer.parseInt(reader.readLine());
    System.out.println("Введите операцию (+, -, / или *):");
    String operations = reader.readLine();
    System.out.println("Введите второе число:");
    int b = Integer.parseInt(reader.readLine());

    switch (operations) {
      case "+":
        System.out.println("Результат сложения равен " + plus(a, b));
        break;
      case "-":
        System.out.println("Результат вычитания равен " + minus(a, b));
        break;
      case "/":
        System.out.println("Результат деления равен " + divide(a, b));
        break;
      case "*":
        System.out.println("Результат умножения равен " + multiply(a, b));
        break;
      default:
        System.out.println("Что-то пошло не так...");
        break;
    }
    reader.close();
  }

  public int plus(int a, int b) {
    return a + b;
  }

  public int minus(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }
}
