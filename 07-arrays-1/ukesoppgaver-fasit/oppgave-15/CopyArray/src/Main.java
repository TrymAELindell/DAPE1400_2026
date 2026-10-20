// Reference solution for exercise 15. Copies an array, changes the copy, and
// prints the first element of both.
public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = ArrayCopier.copyArray(original);

        copy[0] = 100;

        System.out.println("Første element i originalen: " + original[0]);
        System.out.println("Første element i kopien: " + copy[0]);
    }
}
