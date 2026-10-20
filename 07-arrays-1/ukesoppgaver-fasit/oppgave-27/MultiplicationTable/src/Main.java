// Reference solution for exercise 27. The indexes start at 0, so the stored
// value is (row + 1) * (col + 1).
public class Main {
    public static void main(String[] args) {
        int[][] table = new int[4][4];

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }
    }
}
