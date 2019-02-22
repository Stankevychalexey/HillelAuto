package String2;

public class DoubleChar {

  public String doubleChar(String str) {
    String strDoub = "";
    for(int i=0; i < str.length(); i++) {
      strDoub = strDoub + str.charAt(i)+ str.charAt(i);
    }
    return strDoub;
  }
  public static void main(String[] args) {
  }
}
