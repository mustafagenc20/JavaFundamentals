package be.infernalwhale;

public class Opdracht3 {
    public static void main(String[] args) {
        int[] multiples = new int[20];

        for (int i = 0; i < multiples.length; i++) {
            multiples[i] = i * 7;
        }

        for (int i = multiples.length - 1; i >= 0; i--) {
            System.out.println(i + "x7 = " + multiples[i]);
        }

    }
}
