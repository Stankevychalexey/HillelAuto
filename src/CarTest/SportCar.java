package CarTest;

public class SportCar extends SuperCar {
  String name;
  int year;

  public SportCar(String name, int year) {
    super();
    this.name = name;
    this.year = year;
  }

  @Override
  void gas() {
    System.out.println("Sport car is running.");
  }
}
