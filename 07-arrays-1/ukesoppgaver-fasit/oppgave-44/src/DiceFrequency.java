// Reference solution for exercise 44.
//
// Fasit comment (the choice): this solution counts in an array of
// length 7, where the throw value is the index — one counting
// statement covers all six values, and index 0 is never used. Another
// good solution is six int variables with an if chain or a switch;
// that gives six almost identical branches, and the printing cannot be
// a loop either.
public class DiceFrequency {
    public static void main(String[] args) {
        int[] throwValues = {3, 6, 3, 1, 5, 6, 6, 2, 4, 3, 1, 6};

        int[] counts = new int[7];
        for (int throwValue : throwValues) {
            counts[throwValue]++;
        }

        for (int value = 1; value <= 6; value++) {
            System.out.println(value + ": " + counts[value]);
        }
    }
}
