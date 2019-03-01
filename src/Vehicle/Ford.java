package Vehicle;

public class Ford extends Car {

  public Ford(String model, String color, int maxSpeed, String number) {
  super(model, color, maxSpeed, number);
  }


  @Override
  public void gas() {
    System.out.println("Ford starts to go");
  }

  @Override
  public void brake() {
    System.out.println("Ford starts to brake");
  }

  @Override
  public void openDoor() {
    System.out.println("Ford's doors open");
  }

  @Override
  public void blockWindows() {
    System.out.println("Ford's windows blocked");
  }
}
