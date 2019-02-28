package Vehicle;

public class Honda extends Car {

  @Override
  public void openDoor() {
    System.out.println("Honda open door");
  }

  @Override
  public void blockWindows() {
    super.blockWindows();
  }
}
