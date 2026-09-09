// Reference solution for exercise 15. The method builds a new array, so the
// copy and the original are two independent objects.
public class CopyArray {

    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = copyArray(original);

        copy[0] = 100;

        System.out.println("Første element i originalen: " + original[0]);
        System.out.println("Første element i kopien: " + copy[0]);
    }
}
