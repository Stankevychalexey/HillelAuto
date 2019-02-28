package Vehicle;

public class Ford extends Car {

  String color;

  @Override
  public void openDoor() {
    System.out.println("Ford opendoor");
  }

  @Override
  public void blockWindows() {
    System.out.println("Ford block windows");
  }

  public Ford(String name, int year, String color) {
    super(name, year);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
