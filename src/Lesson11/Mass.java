package Lesson11;

import java.util.Arrays;

public class Mass {
    public static void main(String[] args) {
        int[][] mass = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        for (int i = 1; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                if (mass[i][j] < 0) {
                    mass[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mass));
    }
}
