package Lesson11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    try {
      // Заполнить массив случайными числами. Размерность массива задавать с клавиатуры.
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Введите количество строк матрицы (число должно быть больше нуля):");
      int a = Integer.parseInt(reader.readLine());

      System.out.println("Введите количество столбцов матрицы (число должно быть больше нуля):");
      int b = Integer.parseInt(reader.readLine());

      int[][] arr = new int[a][b];
      System.out.println("Оригинальная матрица:");
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          Random random = new Random();
          arr[i][j] = random.nextInt(30) * (random.nextBoolean() ? -1 : 1);
        }
      }
      System.out.println(Arrays.deepToString(arr));

      swapMaxAndMin(arr); // 1. В массиве целых чисел поменять местами максимальный элемент и минимальный.
      int sum = sumOfEven(arr);
      System.out.println("Sum of even numbers is " + sum); // 2. В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
      negativeTransfer(arr); // 3. В массиве целых чисел заменить нулями отрицательные элементы.
      x3Positive(arr); // 4. В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
      diffAvgMin(arr); // 5. В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента.
    } catch (NegativeArraySizeException e) {
      System.out.println("Ну не нужно так... В следующий раз вводи число больше нуля, пожалуйста.");
      System.out.println("А сейчас подумай над своим поведением и запусти программу ещё раз.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // 1. В массиве целых чисел поменять местами максимальный элемент и минимальный.
  private static void swapMaxAndMin(int[] arr) {
    int indexOfMax = 0;
    int indexOfMin = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[indexOfMax])
        indexOfMax = i;
      if (arr[i] < arr[indexOfMin])
        indexOfMin = i;
    }

    int aux = arr[indexOfMax];
    arr[indexOfMax] = arr[indexOfMin];
    arr[indexOfMin] = aux;
  }

  private static void swapMaxAndMin(int[][] matrix) {
    for (int[] arr : matrix) swapMaxAndMin(arr);
  }

  // 2. В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
  private static int sumOfEven(int[] arr) {
    int sum = 0;
    for (int i = 1; i < arr.length; i += 2) {
      sum += arr[i];
    }
    return sum;
  }

  private static int sumOfEven(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr[i].length; j += 2) {
        sum += arr[i][j];
      }
    }
    return sum;
  }

  // 3. В массиве целых чисел заменить нулями отрицательные элементы.
  private static void negativeTransfer(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        arr[i] = 0;
      }
    }
  }

  private static void negativeTransfer(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] < 0) {
          arr[i][j] = 0;
        }
      }
    }
    System.out.println("\nnegative Transfer ");
    System.out.println(Arrays.deepToString(arr));
  }

  // 4. В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
  private static void x3Positive(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > 0 && arr[i + 1] < 0)
        arr[i] = arr[i] * 3;
    }
  }

  private static void x3Positive(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length - 1; j++) {
        if (arr[i][j] > 0 && arr[i][j + 1] < 0) {
          arr[i][j] = arr[i][j] * 3;
        }
      }
    }
    System.out.println("\nMultiple x3: ");
    System.out.println(Arrays.deepToString(arr));
  }

  // 5. В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента.
  // Помогли ребята со стримами
  private static void diffAvgMin(int[][] arr) {
    int min = Arrays.stream(arr).flatMapToInt(Arrays::stream).min().getAsInt();
    int avg = (int) Arrays.stream(arr).flatMapToInt(Arrays::stream).average().getAsDouble();
    int result = avg - min;
    System.out.println("\nDiff between avg and min: " + result);
  }
}