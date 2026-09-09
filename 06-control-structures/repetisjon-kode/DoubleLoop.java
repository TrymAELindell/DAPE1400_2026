public class DoubleLoop {
    public static void main(String[] args) {
        // A loop inside another loop: for every round of the outer loop,
        // the inner loop runs all the way through.
        for (int row = 0; row < 5; row++) {
            System.out.print("\nRow nr: " + row);
            for (int column = 0; column < 3; column++) {
                System.out.print(" column: " + column);
            }
        }
    }
}
