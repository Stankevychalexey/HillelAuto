package CollectionsHomew;

import java.util.*;

public class List {

  static ArrayList<Integer> firstCollection = new ArrayList<>();

  public static void homeTasksCollections() {
    // Сгенерируйте коллекцию целых чисел, используя класс Random(). Используя методы классов-коллекций:
    for (int i = 0; i < 20; i++) {
      firstCollection.add((int) Math.round(Math.random() * 30) + 15);
    }
    System.out.println("\nFirst collection" + firstCollection);

    // А) создайте новую коллекцию, переписав в нее элементы из первой коллекции:
    ArrayList<Integer> secondTask = new ArrayList<>(firstCollection);
    System.out.println("\nSecond collection" + secondTask);


    // Б) определите уникальные числа:
    Set sorted = new TreeSet(firstCollection);
    System.out.println("\nСортировка уникальных значений через TreeSet: " + sorted);

    Set<Integer> set = new HashSet<>(firstCollection);
    System.out.println("Сортировка уникальных значений через HashSet: " + set);

    // В) определите количество каждого уникального числа:
    Set<Integer> uniqueSet = new HashSet<>(firstCollection);
    System.out.println("\nОпределение количества уникальных чисел: " + uniqueSet.size());

    ArrayList<Integer> uniqueNumberQuantity = new ArrayList<>(firstCollection);
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    Integer am;
    for (Integer i : uniqueNumberQuantity) {
      am = hm.get(i);
      hm.put(i, am == null ? 1 : am + 1);
    }
    System.out.println("Количество каждого уникального числа в коллекции: " + hm);


    // Г) отсортируйте коллекцию:
    Collections.sort(firstCollection);
    System.out.println("\nСортировка всей коллекции: " + firstCollection);

    Collections.sort(firstCollection, Collections.reverseOrder());
    System.out.println("Сортировка всей коллекции в обратном порядке: " + firstCollection);

    // Д) найдите макс, мин и сумму чисел коллекции:
    System.out.println("\nМинимальное число: " + Collections.min(firstCollection));
    System.out.println("Минимальное число: " + Collections.max(firstCollection));
    int sum = 0;
    for (int i : firstCollection)
      sum = sum + i;
    System.out.println("Сумма всех чисел коллекции: " + sum);


    // Е) создайте коллекцию, содержащую все положительные числа первой коллекции:
    System.out.print("\nПоложительные числа: ");
    for (int value : firstCollection) {
      if (value >= 0) {
        System.out.print(value + " ");
      }
    }

    System.out.print("\nОтрицательные числа: ");
    for (int value : firstCollection) {
      if (value < 0) {
        System.out.print(value + " ");
      } else if (value >= 0) {
      }
    }
    System.out.println("Отрицательные числа отсутствуют");

    System.out.print("\nВсе чётные числа коллекции: ");
    for (int i = 0; i < firstCollection.size(); i++) {
      int even = firstCollection.get(i) % 2;
      if (even == 0) {
        // firstCollection.remove(i); // если оставить эту строку, то выведуться числа без повторов;
        System.out.print(firstCollection.get(i) + " "); // выведет каждое число с новой строки;
      }
    }

    System.out.print("\nВсе нечётные числа коллекции: ");
    for (int i = 0; i < firstCollection.size(); i++) {
      int even = firstCollection.get(i) % 2;
      if (even != 0) {
        // firstCollection.remove(i); // если оставить эту строку, то выведуться числа без повторов;
        System.out.print(firstCollection.get(i) + " "); // выведет каждое число с новой строки;
      }
    }
    System.out.println("\n");


    // Ж) удалите из первой коллекции все нечетные числа:
    System.out.println("Удалить все нечетные числа из коллекции: ");


    // З) найдите указанное число в массиве (например 7). В случае, если указанного числа нет- выводите сообщение об ошибке.
    System.out.print("\nНайти число 7: ");
    if (firstCollection.contains(7)){
      System.out.println("7");
    }
      System.out.println("Заданное число отсутствует");
  }
}



/*
  Integer[] arr = {0, 7, 4, 3, 9, 8, 5};
  Set sort = new TreeSet(Arrays.asList(arr));
    System.out.println("Сортировка: " + sort);*/
