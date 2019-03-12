package Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) throws IOException {
        int a, b;
// Заполнить массив случайными числами. Размерность массива задавать с клавиатуры.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк массива: ");
        a = Integer.parseInt(reader.readLine());

        System.out.println("Введите количество столбцов массива: ");
        b = Integer.parseInt(reader.readLine());

        int[][] arr = new int[a][b];
        System.out.println("Оригинальный массив: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int) (Math.random()*-15);
                System.out.println(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
