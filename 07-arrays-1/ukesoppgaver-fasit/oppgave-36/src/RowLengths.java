// Reference solution for exercise 36: the snippet from the handout, runnable. The rows of
// a two-dimensional array can have different lengths.
public class RowLengths {
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
