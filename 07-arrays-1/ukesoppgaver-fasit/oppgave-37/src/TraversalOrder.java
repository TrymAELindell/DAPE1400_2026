// Reference solution for exercise 37: the snippet from the handout, runnable. print keeps
// everything on one line; row 0 comes before row 1.
public class TraversalOrder {
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
