package lesson2;

public class Incr {
    public static void main(String[] args) {
        int a = 8;
        int b = a++;
        System.out.println(a); // 9
        System.out.println(b); // 8

        int c = 8;
        int d = --a;
        System.out.println(c); // 7
        System.out.println(d); // 7
    }
}
