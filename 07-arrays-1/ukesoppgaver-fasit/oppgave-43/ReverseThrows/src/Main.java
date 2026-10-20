// Reference solution for exercise 43. Dialog-based, so it is checked by hand.
//
// Denne løsningen lagrer de fem kastene i en array og skriver den ut med
// en for-loop som går baklengs. Alle fem kastene må tas vare på til
// innlesingen er ferdig. En annen god løsning er en streng der hvert nytt
// kast settes foran. Ulempen er at strengen bare kan skrives ut. Selve
// tallene går tapt for en senere sum eller sammenlikning.
public class Main {
    public static void main(String[] args) {
        int[] throwValues = new int[5];

        for (int i = 0; i < throwValues.length; i++) {
            throwValues[i] = UserInput.readNumber("Skriv inn terningkast nummer " + (i + 1) + ":");
        }

        for (int i = throwValues.length - 1; i >= 0; i--) {
            System.out.println(throwValues[i]);
        }
    }
}
