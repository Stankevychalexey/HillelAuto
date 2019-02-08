package warmup1;

public class Diff21 {
  public int diff21(int n) {
    return (n <= 21) ? 21 - n : 2 * (n - 21);
  }
}

/*
  return absolute difference between n and 21 if n <= 21;
  return absolute difference * 2 if n > 21;
 */

/* Description:
  Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

  diff21(19) → 2
  diff21(10) → 11
  diff21(21) → 0
*/


/* solution 1:
public class Diff21 {
  public int diff21(int n) {
    if (n <= 21) {
      return 21 - n;
    } else {
      return 2 * (n - 21);
    }
  }
}*/
