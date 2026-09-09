// Reference solution for exercise 45.
//
// Fasit comment (the choice): this solution uses a two-dimensional
// boolean array, because the two indexes in sold[row][col] match the
// hall's rows and seats directly. Another good solution is one boolean
// array of length 12, where seat (row, col) lives at index
// row * 4 + col; a mistake in that arithmetic puts an X on the wrong
// row without any error message.
public class CinemaSeatMap {
    public static void main(String[] args) {
        boolean[][] sold = new boolean[3][4];
        sold[0][1] = true;
        sold[1][0] = true;
        sold[2][3] = true;

        for (int row = 0; row < sold.length; row++) {
            String line = "";
            for (int col = 0; col < sold[row].length; col++) {
                if (sold[row][col]) {
                    line += "X";
                } else {
                    line += ".";
                }
            }
            System.out.println(line);
        }
    }
}
