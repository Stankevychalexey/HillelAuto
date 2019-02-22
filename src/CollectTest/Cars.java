package CollectTest;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Cars {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Ford");
    cars.add("Honda");
    System.out.println(cars);

    for (int i = 0; i < cars.size(); i++){
      System.out.println(cars.get(i));
    }

    System.out.println(cars.size());

    cars.add(1, "BMW");
    cars.set(1, "BMW");
    System.out.println(cars);

    // Сортировка
    Set set = new TreeSet();
    set.add("0");
    set.add("7");
    set.add("5");
    set.add("9");
    set.add("8");
    set.add("2");
    for (Object i : set) {
      System.out.println(i);
    }
  }
}
