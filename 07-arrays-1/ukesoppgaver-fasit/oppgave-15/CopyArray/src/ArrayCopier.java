// Reference solution for exercise 15. The method builds a new array, so the
// copy and the original are two independent objects.
public class ArrayCopier {

    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
}
