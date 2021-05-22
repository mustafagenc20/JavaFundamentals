package be.infernalwhale;

import java.util.Arrays;

public class JaggedArrays {
    public static void main(String[] args) {
        int[][] numberGrid = new int[4][];
        numberGrid[0] = new int[6];
        numberGrid[1] = new int[3];
        numberGrid[2] = new int[22];
        numberGrid[3] = new int[1];

        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                numberGrid[i][j] = 25 + i + j;
            }
        }

        for (int[] arr : numberGrid) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("\n\nPrint integers!!");
        printIntegers(2, 3, 4, 5, 6, 7, 8, 9);

    }

    public static void printIntegers(double somethingElse, int... values) {
        System.out.println("Somet: " + somethingElse);
        System.out.println(Arrays.toString(values));
    }

    public static void printArray(int[][] array) {

    }

}
