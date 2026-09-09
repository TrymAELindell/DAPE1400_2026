// Reference solution for exercise 38: the corrected version. The handout's snippet has
// row < 8, an off-by-one that drops the last row; the fix is <=.
public class SeatRowsFixed {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) {
            System.out.println("Rad " + row);
        }
    }
}
