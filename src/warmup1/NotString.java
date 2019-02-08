package warmup1;

public class NotString {
  public String notString(String str) {
    return (str.startsWith("not")) ? str : "not " + str;
  }
}

/*
  return str if it begins with "not";
  return "not " + str if it is doesn't;
 */


/* Description:
  Given a string, return a new string where "not " has been added to the front.
  However, if the string already begins with "not", return the string unchanged.
  Note: use .equals() to compare 2 strings.

  notString("candy") → "not candy"
  notString("x") → "not x"
  notString("not bad") → "not bad"
*/


/* Solution 1:
public class NotString {
  public String notString(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
      return str;
    }
    return "not ".concat(str);
  }
}
*/

/* Solution 2:
public class NotString {
  public String notString(String str) {
    if (str.startsWith("not")) {
      return str;
    }
    return "not " + str;
  }
}*/
