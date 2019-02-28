package Vehicle;

public class Main {
  public static void main(String[] args) {

    Ford ford = new Ford("Focus", 2010, "white");
    System.out.println(ford.name + ", " + ford.color);
    ford.openDoor();
  }
}
