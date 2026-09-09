// Reference solution for exercise 29: the snippet from the handout, runnable. The counter
// is both the printed index and the array index.
public class IndexAndValue {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Indeks " + i + ": " + numbers[i]);
        }
    }
}
