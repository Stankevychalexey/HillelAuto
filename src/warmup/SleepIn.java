package warmup;

public class SleepIn {
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not ".concat(str);

    }

    public static void main(String[] args) {

    }
}
