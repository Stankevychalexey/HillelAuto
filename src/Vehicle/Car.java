package Vehicle;

public abstract class Car implements Vehicle {

  private String model;
  private String color;
  private int maxSpeed;
  private String number;

  public Car(String model, String color, int maxSpeed, String number) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
    this.number = number;
  }

  public Car(String model, String number){
    this.model = model;
    this.number = number;
  }

  public Car(){

  }

  public final void wheelQuantity() {
    System.out.println("This car has 4 wheels");
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public abstract void setColor(CarColor red);
}
