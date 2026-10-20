// Reference solution for exercise 29.
//
// Koden fra oppgaven, gjort kjørbar. Tellevariabelen er både indeksen som
// skrives ut, og indeksen i arrayen.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Indeks " + i + ": " + numbers[i]);
        }
    }
}
