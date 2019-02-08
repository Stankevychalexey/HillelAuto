package warmup1;

public class Front22 {
  public String front22(String str) {
    int given = 2;
    if (given > str.length()) {
      given = str.length();
    }
    String front = str.substring(0, given);
    return front + str + front;
  }
}


/* Description:
  Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
  so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

  front22("kitten") → "kikittenki"
  front22("Ha") → "HaHaHa"
  front22("abc") → "ababcab"
*/
