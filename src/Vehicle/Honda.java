package Vehicle;

public class Honda extends Car {

  class InnerHonda{
    public void headlights(){
      System.out.println("Honda turns on the headlights");
    }
  }

  public static void main(String[] args) {
    Honda.InnerHonda headlights = new Honda().new InnerHonda();
    headlights.headlights();
  }

  public Honda(String model, String color, int maxSpeed, String number) {
    super(model, color, maxSpeed, number);
  }

  public Honda(String model, String number) {
    super(model, number);
  }

  public Honda() {
  }

  @Override
  public void setColor(CarColor red) {

  }

  @Override
  public void gas() {
    System.out.println("Honda starts to go");
  }

  @Override
  public void brake() {
    System.out.println("Honda starts to break");
  }

  @Override
  public void openDoor() {
    System.out.println("Honda's doors open");
  }

  @Override
  public void blockWindows() {
    System.out.println("Honda's windows blocked");
  }
}
