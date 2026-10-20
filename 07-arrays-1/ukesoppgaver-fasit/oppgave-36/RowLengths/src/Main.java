// Reference solution for exercise 36.
//
// Koden fra oppgaven, gjort kjørbar. Radene i en todimensjonal array kan ha
// forskjellig lengde.
public class Main {
    public static void main(String[] args) {
        int[][] groups = {
            {2, 4},
            {10},
            {1, 1, 1}
        };

        for (int row = 0; row < groups.length; row++) {
            System.out.println("Antall elementer på rad " + row + ": " + groups[row].length);
        }
    }
}
