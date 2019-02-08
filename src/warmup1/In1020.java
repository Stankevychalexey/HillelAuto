package warmup1;

public class In1020 {
  public boolean in1020(int a, int b) {
    return (a >= 10 && a <= 20 || b >= 10 && b <= 20);
  }
}


// return true if a >= 10 AND a <= 20 OR b >= 10 AND b <= 20;
// another words: a -> [10 - 20] AND b -> [10 - 20];

/* Description:
  Given 2 int values, return true if either of them is in the range 10..20 inclusive.

  in1020(12, 99) → true
  in1020(21, 12) → true
 */