package lesson2;

public class Incr2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++  = " + (a++));
        System.out.println(a);
        System.out.println("a--  = " + (a--));
        System.out.println(a);
        // Проверьте разницу в d++ и ++d
        System.out.println("c++  = " +  (c++));
        System.out.println("++d  = " +  (++d));
    }
}
