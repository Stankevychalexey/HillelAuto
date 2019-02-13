package lesson5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class List {

    static ArrayList<Integer> firstCollection = new ArrayList<>();

    public static void firstTask() {
        for (int i = 0; i < 5; i++) {
            firstCollection.add((int) Math.round(Math.random() * 30) + 15);
        }
        System.out.println("First collection" + firstCollection);
    }

    public static void secondTask(){
        ArrayList<Integer> secondTask = new ArrayList<>(firstCollection);
        System.out.println("Second collection" + secondTask);
    }

    public static void thirdTask(){
        Set<Integer> set = new HashSet<>();

    }
}



/*
package warmup2;

        import java.util.ArrayList;

public class List {

    static ArrayList<Integer> firstCollection = new ArrayList<>();
    public static void firstTask(){
        firstCollection.add(8);
        firstCollection.add(8);
        firstCollection.add(8);
        firstCollection.add(8);
        firstCollection.add(8);
        System.out.println("First collection" + firstCollection);
    }
}*/
