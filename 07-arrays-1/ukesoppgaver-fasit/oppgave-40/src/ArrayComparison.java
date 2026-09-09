import java.util.Arrays;

// Reference solution for exercise 40.
//
// Fasit comment (the choice): this solution uses Arrays.equals,
// because the task's rule — same length, same values, same order — is
// exactly what that method checks. Another good solution is a for loop
// that compares the lengths and then every pair of elements; there an
// off-by-one gives a wrong answer without any error message.
public class ArrayComparison {
    public static void main(String[] args) {
        int[] first = {2, 5, 1, 8, 2};
        int[] second = {2, 5, 1, 8, 2};

        if (Arrays.equals(first, second)) {
            System.out.println("Rekkene er like");
        } else {
            System.out.println("Rekkene er ikke like");
        }
    }
}
