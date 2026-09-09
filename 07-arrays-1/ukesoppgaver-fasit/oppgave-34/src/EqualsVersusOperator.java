import java.util.Arrays;

// Reference solution for exercise 34: the program from the handout, runnable. == compares
// the references, Arrays.equals compares the content.
public class EqualsVersusOperator {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(a == b);
        System.out.println(Arrays.equals(a, b));
    }
}
