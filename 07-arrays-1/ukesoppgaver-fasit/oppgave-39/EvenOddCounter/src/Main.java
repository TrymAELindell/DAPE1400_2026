// Reference solution for exercise 39.
//
// Denne løsningen lagrer tallene i en array og teller med en
// for-each-loop, fordi tellingen trenger hver verdi og ingenting annet. En
// annen god løsning er en vanlig for-loop med indeks. Den indeksen er
// ekstra kode, fordi oppgaven aldri bruker den.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {45, 34, 5, 8, 10, 2, 13, 25};

        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Antall partall: " + evenCount);
        System.out.println("Antall oddetall: " + oddCount);
    }
}
