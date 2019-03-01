package Vehicle;

public class Main {
  public static void main(String[] args) {


    Ford fordFocus = new Ford("Focus", "White", 240, "DD 3333 DD");
    System.out.println("The number of the fordAlex car is: " + fordFocus.getNumber());
    System.out.println(fordFocus.getModel());
    fordFocus.wheelQuantity();

    fordFocus.gas();


  }
}
