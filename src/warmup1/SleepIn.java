package warmup1;

public class SleepIn {

  public boolean sleepIn(boolean weekday, boolean vacation) {
    return (!weekday || vacation);
  }
}

// return true if !weekday OR vacation;

/*
  Description:
  The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
  We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

  sleepIn(false, false) → true
  sleepIn(true, false) → false
  sleepIn(false, true) → true
 */


/*  variant 2:
  public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
      return true;
    } else {
      return false;
    }
  }

  variant 3:
  public boolean sleepIn(boolean weekday, boolean vacation) {
    boolean result = false;
    if (!weekday || vacation)
      return true;

    return result;
  }*/
