package warmup1;

public class MonkeyTrouble {
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return (aSmile && bSmile || !aSmile && !bSmile);
  }
}

/*
 return true (in trouble) if a is smiling AND b is smiling;
 OR
 return true (in trouble) if a is NOT smiling and b is NOT smiling;
 */

/*
 Description:
 We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

 monkeyTrouble(true, true) → true
 monkeyTrouble(false, false) → true
 monkeyTrouble(true, false) → false
 */


/*
public class MonkeyTrouble {
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile && bSmile || !aSmile && !bSmile) {
      return true;
    } else {
      return false;
    }
  }
}*/
