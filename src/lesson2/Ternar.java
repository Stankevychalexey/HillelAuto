package lesson2;

public class Ternar {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30; // если выполнится первое условие в скобках, то присвоится значению после знака вопроса, если нет - выполнится третье условие;
        System.out.println("Значение b: " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Значение b: " + b);
    }
}
