package be.intecbrussel.Chapter_05.Arrays;

public class StringArrays {
    public static void main(String[] args) {
        String[] s = new String[20];
        String[] t = {"Hello World"};

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        // Define array and split text into array
        String[] words = text.split(" ");

        // Loop over elements in array using counter (i)
//        for (int i = 0; i < words.length; i++) {
//             Change element to uppercase and print on console
//            System.out.println(words[i].toUpperCase());
//        }

        // Print args array
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
