// Reference solution for exercise 25.
public class TablePrint {
    public static void main(String[] args) {
        int[][] table = {
            {2, 4, 6},
            {1, 3, 5},
            {8, 10, 12}
        };

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }
    }
}
