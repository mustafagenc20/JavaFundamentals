package be.intecbrussel.Chapter_05.Arrays.oplossingentest;

public class QuestionOneB {
    public static void main(String[] args) {
        String text = "The metal–oxide–semiconductor field-effect transistor (MOSFET, MOS-FET, or MOS FET), also known as the metal–oxide–silicon transistor (MOS transistor, or MOS),[1] is a type of insulated-gate field-effect transistor that is fabricated by the controlled oxidation of a semiconductor, typically silicon. The voltage of the covered gate determines the electrical conductivity of the device; this ability to change conductivity with the amount of applied voltage can be used for amplifying or switching electronic signals.";
        String cleanText = text
                .replaceAll("–", " ")
                .replaceAll("-", " ")
                .replace('(', ' ')
                .replace(')', ' ')
                .replace('[', ' ')
                .replace(']', ' ')
                .replace(',', ' ')
                .replace('.', ' ')
                .replace(';', ' ');

        String[] words = cleanText.split(" ");

        String[] longWords = new String[1];

        int longWordsCount = 0;
        for (String s : words) {
            if (s.length() > 5) {
                longWords[longWordsCount] = s;
                longWordsCount++;

                String[] newArray = new String[longWords.length + 1];
                int i = 0;
                for (String t : longWords) {
                    newArray[i++] = t;
                }
                longWords = newArray;
            }
        }

        for (String s : longWords) {
            if (s != null && !s.equals("")) System.out.println(s);
        }
    }
}


/*
Maak een array door de paragraaf hieronder in woorden te delen.
Maak vervolgens een nieuwe array met alle woorden uit de eerste array die meer dan 5 **letters** bevatten en druk deze array af. Zorg ervoor dat je alleen letters telt!!



 */
