package Lesson10;

public class ExceptionsExample {
  private ABC abc;

  // RuntimeException: ArithmeticException, MyNullPointerException, IndexOutOfBoundsException
  public void ArithmeticException() {
    try {
      int a = 0;
      int b = 5;
      int c = 0;
      c = b / a;
    } catch (ArithmeticException e) {
      System.out.print("ArithmeticException. НЕ ДЕЛАЙ ТАК - НЕ ДЕЛИ НА НОЛЬ");
    } finally {
      System.out.println(", красавчик");
    }
  }

  public void NullPointerException() {
    try {
      abc.show();
    } catch (NullPointerException e) {
      System.out.println("dsgf");
    }
  }

  public void MyNullPointerException() {
    try {
      throw new NullPointerException("My Exception");
    } catch (NullPointerException e) {
      System.out.println("My NullPointer");
    }
  }

  public void IndexOutOfBoundsException() {
    try {
      int[] arr = {1, 2, 3, 4};
      arr[5] = 7;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("IndexOutOfBoundsException. Вылез за границу массива");
    }
  }
}