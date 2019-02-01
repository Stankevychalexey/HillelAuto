package lesson2;

import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        if (sc.hasNextDouble()){
            double number = sc.nextInt();
            System.out.println("You have entered " + number);
        } else {
            System.out.println("It doesn't work");
        }

        sc.close(); // закрываем Сканнер после выполнения наших действий;
    }
}
