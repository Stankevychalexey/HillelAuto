package Lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mass = {0, 6, 7, -9, 2, 1};
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < mass.length-1; i++) {
                if (mass[i] > mass[i + 1]) {
                    flag = false;
                    int c = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = c;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
