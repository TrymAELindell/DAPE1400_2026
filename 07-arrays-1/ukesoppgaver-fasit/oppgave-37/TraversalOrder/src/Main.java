// Reference solution for exercise 37.
//
// Koden fra oppgaven, gjort kjørbar. print holder alt på én linje, og rad 0
// kommer før rad 1.
public class Main {
    public static void main(String[] args) {
        int[][] table = {
            {1, 2},
            {3, 4}
        };

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
        }
        System.out.println();
    }
}
