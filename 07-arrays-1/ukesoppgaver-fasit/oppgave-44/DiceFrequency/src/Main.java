// Reference solution for exercise 44.
//
// Denne løsningen teller i en array med lengde 7, der verdien på kastet er
// indeksen. Én tellesetning dekker da alle seks verdiene, og indeks 0 blir
// aldri brukt. En annen god løsning er seks int-variabler med en
// else if-kjede eller en switch. Det gir seks nesten like greiner. Utskriften kan
// heller ikke være en loop.
public class Main {
    public static void main(String[] args) {
        int[] throwValues = {3, 6, 3, 1, 5, 6, 6, 2, 4, 3, 1, 6};

        int[] counts = new int[7];
        for (int throwValue : throwValues) {
            counts[throwValue]++;
        }

        for (int value = 1; value <= 6; value++) {
            System.out.println(value + ": " + counts[value]);
        }
    }
}
