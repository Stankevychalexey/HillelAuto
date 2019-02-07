package warmup1;

public class SumDouble {
  public int sumDouble(int a, int b) {
    return (a != b) ? a + b : 2 * (a + b);
  }
}

/*
  return the sum if a AND b is different;
  return 2 * sum if a == b;
*/


/*
  Description:
  Given two int values, return their sum. Unless the two values are the same, then return double their sum.

  sumDouble(1, 2) → 3
  sumDouble(3, 2) → 5
  sumDouble(2, 2) → 8
*/


/* solution 1:
  public int sumDouble(int a, int b) {
    int sum = a + b;
    if (a != b) {
      return sum;
    }
    return 2 * sum;
  }*/
