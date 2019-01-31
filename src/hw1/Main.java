package hw1;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.checkThree(3);

    calculator.addition();
    calculator.subtraction();
    calculator.multiplication();
    calculator.division();
  }
}

/*
public boolean checkThree(int a) {
    return a % 3 == 0;
 */