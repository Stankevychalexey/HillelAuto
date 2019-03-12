package Vehicle;

public class Main {
  public static void main(String[] args) {


    Ford fordFocus = new Ford("Focus", "White", 240, "DD 3333 DD");
    System.out.println("The number of the fordAlex car is: " + fordFocus.getNumber());
    System.out.println(fordFocus.getModel());
    fordFocus.wheelQuantity();

    fordFocus.gas();

    fordFocus.wheelQuantity();

    Ford fordMondeo = new Ford("Mondeo", "AX 7778 EM");
    System.out.println("The model of the new Ford is " + fordMondeo.getModel() + " and it's number is " + fordMondeo.getNumber() + ".");
    fordMondeo.brake();

    Honda hondaAccord = new Honda("Accord", "black", 240, "AX 3335 EM");
    System.out.println("Here is a new car - Honda " + hondaAccord.getModel() + ", it's max speed is "
            + hondaAccord.getMaxSpeed() + " and it's color is " + hondaAccord.getColor() + ".");

    hondaAccord.openDoor();
    hondaAccord.blockWindows();

    System.out.println("Honda's color is " + CarColor.red + " now.");
    System.out.println("Ford's color is " + CarColor.white + " now.");
  }
}
