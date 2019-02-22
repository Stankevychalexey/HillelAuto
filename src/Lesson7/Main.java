package Lesson7;

public class Main {
    public static void main(String[] args) {
        Mushrooms mushrooms = new Mushrooms();
        mushrooms.setName("Мухомор");
        System.out.println(mushrooms.getName());

        Mushrooms mushrooms1 = new Mushrooms();
        mushrooms1.setName("Поганка");
        mushrooms1.setHeight(5);
        System.out.println(mushrooms1.getName());

        Mushrooms mushrooms2 = new Mushrooms();
        mushrooms2.setName("Белый");
        mushrooms2.setHeight(6);
        mushrooms2.setWeight(3);
        System.out.println(mushrooms2.getName());

        Mushrooms mushrooms3 = new Mushrooms();
        mushrooms3.setName("Опята");
        mushrooms3.setWeight(4);
        mushrooms.setHeight(3);
        mushrooms3.setColor("Коричневый");
        System.out.println(mushrooms3.getName().concat(mushrooms3.getColor()));
    }
}
