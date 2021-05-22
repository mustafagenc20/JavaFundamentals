package be.infernalwhale;

import java.util.Arrays;
import java.util.Random;

public class QuestionTwo {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(9) + 1;
            }
        }

        for (int[] a : numbers) {
            System.out.println(Arrays.toString(a));
        }

        int[] sums = calculateRowSums(numbers);
        System.out.println(Arrays.toString(sums));

        int[] sumOfColumns = calculateColSums(numbers);
        System.out.println(Arrays.toString(sumOfColumns));

        int sumOfAll = calculateSumOfAllNumbers(numbers);
        System.out.println(sumOfAll);
    }

    public static int calculateSumOfAllNumbers(int[][] array2d) {
        int result = 0;

        int[] sumOfAllRows = calculateRowSums(array2d);
        result = sumOfRow(sumOfAllRows);

        return result;
    }

    public static int[] calculateColSums(int[][] array2d) {
        int[] result = new int[array2d.length];

        for (int colIndex = 0; colIndex < array2d.length; colIndex++) {
            int sum = 0;
            for (int rowIndex = 0; rowIndex < array2d.length; rowIndex++) {
                sum += array2d[rowIndex][colIndex];
            }
            result[colIndex] = sum;
        }

        return result;
    }

    public static int[] calculateRowSums(int[][] array2d) {
        int[] result = new int[array2d.length];

        for (int i = 0; i < array2d.length; i++) {
            result[i] = sumOfRow(array2d[i]);
        }

        return result;
    }

    public static int sumOfRow(int[] array) {
        int result = 0;

        for (int i : array) {
            result += i;
        }

        return result;
    }
}

/*
## QuestionTwo.java

Schrijf een main methode die het volgende doet:

* Maak een 2d integer array van 9x9
* Vul de volledige array met random integers (kleinste: 1 - grootste: 9)
* Roep 1 van de methodes op die hieronder staat
* Het resultaat van de methode afdrukt.

Schrijf nu methodes met de volgende functionaliteit:

1. Een methode die de som berekent voor elke rij van de array
2. Een methode die de som berekent voor elke kolom van de array
3. Een methode die de som berekent voor de hele array.

Voor de duidelijkheid:
* De methodes zelf tonen niets op de console. Dat doe je enkel in de main.
 */