// Reference solution for exercise 21: the outer loop walks the rows, and for each
// row the inner loop produces the five products.
public class MultiplicationTable {
    public static void main(String[] args) {
        String output = "";
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                output += row * column;
                if (column < 5) {
                    output += "\t";
                }
            }
            output += "\n";
        }
        System.out.print(output);
    }
}
