package Vehicle;

public abstract class Car implements Vehicle {

  String name;
  int year;

  public Car(String name, int year) {
    this.name = name;
    this.year = year;
  }

  public void openDoor() {
    System.out.println("Car opendoor");
  }

  public void blockWindows() {
    System.out.println("Car blockwindow");
  }

  public Car() {
    int passengers = 5;
  }
}
