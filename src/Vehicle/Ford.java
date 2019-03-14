package Vehicle;

public class Ford extends Car {

  class InnerFord{
    public void beep(){
      System.out.println("Ford is beeping");
    }
  }

  public static void main(String[] args) {
    Ford.InnerFord beep = new Ford().new InnerFord();
    beep.beep();
  }

  public Ford(String model, String color, int maxSpeed, String number) {
  super(model, color, maxSpeed, number);
  }

  public Ford(String model, String number) {
    super(model, number);
  }

  public Ford() {
  }



  @Override
  public void setColor(CarColor red) {

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
