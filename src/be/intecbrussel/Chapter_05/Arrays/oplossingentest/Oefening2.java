package be.intecbrussel.Chapter_05.Arrays.oplossingentest;

import java.util.Arrays;
import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {
        int[][] array = new int[9][9];
        // Step 1:
        array = fillArrayWithRandomNumbers(array);

        // Step 2:
        int[] sumOfRows = calculateSumOfRows(array);

        // Step 3:
        System.out.println(Arrays.toString(sumOfRows));
        System.out.println(sumOfRows);
    }

    public static int[] calculateSumOfRows(int[][] array) {
        int[] sums = new int[array.length]; // 9

        for (int i = 0; i < array.length; i++) {
            // int sum = sumOfAllElementsIn(array[i])
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) sum = sum + array[i][j];
            sums[i] = sum;
        }

        return sums;
    }

    public static int[][] fillArrayWithRandomNumbers(int[][] arrayToBeFilled) {
        Random random = new Random();

        // Reference types >> String, Random, Date,.... // Complex datatypes
        // Value types >> double, int, float, char...   // Primitive Datatypes
        for (int i = 0; i < arrayToBeFilled.length; i++) {
            for (int j = 0; j < arrayToBeFilled[i].length; j++) {
                arrayToBeFilled[i][j] = random.nextInt(9) + 1;
            }
        }
        // arrayToBeFilled[i]
        return arrayToBeFilled;
    }
}
