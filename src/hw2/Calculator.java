package hw2;

import static hw2.Operations.*;

public class Calculator {

  public int operations(int a, int b, String operation) {

    switch (operation) {
      case "+":
        return plus(a, b);

      case "-":
        return minus(a, b);

      case "/":
        return divide(a, b);

      case "*":
        return multiply(a, b);

      default:
        System.out.println("Что-то пошло не так...");
        return 0;
    }
  }
}
