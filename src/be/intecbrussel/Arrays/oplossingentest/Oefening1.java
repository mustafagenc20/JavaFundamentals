package be.infernalwhale;

import java.util.Arrays;

public class Oefening1 {
    public static void main(String[] args) {
        // S1: Opdelen/verdelen/splitten
        String input = "NX technology, commonly known as NX or NoMachine, is a proprietary software application for remote access, desktop sharing, virtual desktop and file transfer between computers.";
        String[] outputS1 = input.split(" ");

        // S2: selecteren/filteren
        // outputS1 << input voor de loop
        // min lengte van een woord = 5
        int minLength = 5; // << input voor selectie
        String[] outputS2 = new String[outputS1.length];

        for (int i = 0; i < outputS1.length ; i++) {
            if (outputS1[i].length() > minLength) outputS2[i] = outputS1[i];
        }
        // outputS2[i] = outputS1[i]


        System.out.println(Arrays.toString(outputS2));
    }
}
