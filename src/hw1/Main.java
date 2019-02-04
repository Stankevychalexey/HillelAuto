package hw1;

/**
 *  Задание 1:
 *  Создать класс “Калькулятор”
 *  Реализовать математические операции “+, -, /, *” с помощью соответствующих методов
 *  В конце математической операции выводить буквенное описание.
 *
 *  Задание 2:
 *  Создайте метод, который будет проверять делится ли число на 3 без остатка или нет. Например,
 *  если число 9, тогда метод должен возвращать true
 *  если число 25, тогда метод должен возвращать false
 *  если число 102, тогда метод должен возвращать true
 */

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Остаток после деления: " + calculator.checkThree(3));
    calculator.checkThree(3);

    System.out.println("Это операция сложения. Результат сложения равен " + calculator.plus(3, 5));
    System.out.println("Это операция вычитания. Результат вычитания равен " + calculator.minus(8, 7));
    System.out.println("Это операция умножения. Результат умножения равен " + calculator.multiply(5, 3));
    System.out.println("Это операция деления. Результат деления равен " + calculator.divide(12, 4));
  }
}

/*    calculator.addition();
      calculator.subtraction();
      calculator.multiplication();
      calculator.division();*/


/*
public boolean checkThree(int a) {
    return a % 3 == 0;
 */