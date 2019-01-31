package hw1;

public class Calculator {
  public void checkThree(int a) {
    if (a % 3 == 0) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }

  public void addition() {
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
  }
}