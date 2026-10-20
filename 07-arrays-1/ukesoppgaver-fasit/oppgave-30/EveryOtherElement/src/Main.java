// Reference solution for exercise 30.
//
// Koden fra oppgaven, gjort kjørbar. Loopen starter på indeks 1 og går to
// steg per runde, altså indeks 1, 3 og 5.
public class Main {
    public static void main(String[] args) {
        int[] values = {4, 8, 15, 16, 23, 42};

        for (int i = 1; i < values.length; i += 2) {
            System.out.println(values[i]);
        }
    }
}
