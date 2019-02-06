package warmup;

public class MissingChar {
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }

    public static void main(String[] args) {

    }

}
