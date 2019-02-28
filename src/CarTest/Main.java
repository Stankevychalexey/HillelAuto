package CarTest;

public class Main {
  public static void main(String[] args) {
    SportCar bmw = new SportCar("BMW", 2017);
    bmw.gas();

    FireEngine fire = new FireEngine();
    fire.gas();
  }
}
