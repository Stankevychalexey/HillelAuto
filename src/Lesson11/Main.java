package Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {

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
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        Random random = new Random();
        int number = random.nextInt(30) * (random.nextBoolean() ? -1 : 1);
        arr[i][j] = number;
      }
      System.out.println();

      System.out.println(Arrays.deepToString(arr));
    }

    sumOfEven(arr);
    x3Positive(arr);
    negativeTransfer(arr);

    diffAvgMin(arr);

  }

  // В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
  private static void sumOfEven(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (j % 2 == 0) {
          sum += arr[i][j];
        }
      }
    }
    System.out.println("\nSum of even numbers is " + sum);
  }

  // В массиве целых чисел заменить нулями отрицательные элементы.
  private static void negativeTransfer(int[][] arr) {
    int[][] negative = arr;
    for (int i = 0; i < negative.length; i++) {
      for (int j = 0; j < negative[i].length; j++) {
        if (negative[i][j] < 0) {
          negative[i][j] = 0;
        }
      }
    }
    System.out.println("\nnegative Transfer ");
    System.out.println(Arrays.deepToString(negative));
  }

  // В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
  private static void x3Positive(int[][] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j <= arr[i].length - 2; j++) {
        if (arr[i][j] < 0 & arr[i][j + 1] > 0) {
          arr[i][j + 1] = arr[i][j + 1] * 3;
        }
      }
    }
    System.out.println("\nMultiple x3: ");
    System.out.println(Arrays.deepToString(arr));
  }

  // В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента.
  // Помогли ребята со стримами
  private static void diffAvgMin(int[][] arr) {
    int min = Arrays.stream(arr).flatMapToInt(Arrays::stream).min().getAsInt();
    int avg = (int) Arrays.stream(arr).flatMapToInt(Arrays::stream).average().getAsDouble();
    int result = avg - min;
    System.out.println("\nDiff between avg and min: " + result);
  }
}