package warmup2;

import java.util.*;

public class List {

  static ArrayList<Integer> firstCollection = new ArrayList<>();


  public static void firstTask() {
    for (int i = 0; i < 50; i++) {
      firstCollection.add((int) Math.round(Math.random() * 30) + 15);
    }
    System.out.println("First collection" + firstCollection);

    ArrayList<Integer> secondTask = new ArrayList<>(firstCollection);
    // secondTask.contains()
    System.out.println("Second collection" + secondTask);

    Set<Integer> set = new HashSet<>(firstCollection);
    System.out.println("Unique" + set);

    Set sort = new TreeSet(firstCollection);
    System.out.println("Сортировка" + sort);


    Map<Integer, Integer> map_final = new HashMap<>();


    for (int num : firstCollection) {
      if (null != map_final.get(num))
        map_final.put(num, 1);
      else
        map_final.put(num, map_final.get(num) + 1);
    }

    Object[] arr = firstCollection.toArray();
    Arrays.sort(arr);

    Collections.sort(firstCollection);

  }


}



/*
package warmup2;

        import java.util.ArrayList;

public class List {

    static ArrayList<Integer> firstCollection = new ArrayList<>();
    public static void homeTasksCollections(){
        firstCollection.add(8);
        firstCollection.add(8);
        firstCollection.add(8);
        firstCollection.add(8);
        firstCollection.add(8);
        System.out.println("First collection" + firstCollection);
    }
}*/




