package be.intecbrussel.Chapter_05.Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[][] numbers2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} , {7, 8, 9}}; // new int[3][4]

        int[][] numberGrid = new int[5][2];

        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                numberGrid[i][j] = i * 10 + j;
            }
        }

        for (int[] arr : numberGrid) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
