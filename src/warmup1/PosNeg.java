package warmup1;

public class PosNeg {
  public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
      return (a < 0 && b < 0);
    } else {
      return (a < 0 && b >= 0 || a >= 0 && b < 0);
    }
  }
}


/*
  negative = true;
  return true (negative) if a < 0 AND b < 0
  ELSE
  return true if a < 0 AND b >= 0 OR a >= 0 AND b < 0;
 */

/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

  posNeg(1, -1, false) → true
  posNeg(-1, 1, false) → true
  posNeg(-4, -5, true) → true
*/


/* solution 1:
public class PosNeg {
  public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
      return (a < 0 && b < 0);
    } else {
      return (a < 0 && b >= 0 || a >= 0 && b < 0);
    }
  }
}*/
