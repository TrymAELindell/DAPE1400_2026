// Reference solution for exercise 16 (discovery drill). y = x copies the
// reference, so both variables refer to the same array object.
public class ReferenceAssignment {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = x;

        y[0] = 100;

        System.out.println(x[0]);
    }
}
