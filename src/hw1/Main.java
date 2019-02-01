package hw1;

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