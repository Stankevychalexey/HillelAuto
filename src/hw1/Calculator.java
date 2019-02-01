package hw1;

public class Calculator {
  public boolean checkThree(int a) {
    if (a % 3 == 0) {
      return true;
    } else {
      return false;
    }
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

/*  public void addition() {
    System.out.println("Это операция сложения");
  }

  public void subtraction() {
    System.out.println("Это операция вычитания");
  }

  public void multiplication() {
    System.out.println("Это операция умножения");
  }

  public void division() {
    System.out.println("Это операция деления");
  }*/
}