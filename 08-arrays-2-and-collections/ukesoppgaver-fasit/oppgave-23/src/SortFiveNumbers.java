import java.util.Arrays;

// Reference solution for exercise 23 (Del 3).
public class SortFiveNumbers {
    public static void main(String[] args) {
        // An array with Arrays.sort fits here: the five values are a fixed
        // count that never grows or shrinks, so the array from module 07 is
        // all the job needs. An ArrayList with Collections.sort would also
        // work, but it buys nothing — the list's whole point is a size that
        // changes, and this one never does, at the cost of wrapper-class
        // ceremony around plain ints.
        int[] numbers = {42, 7, 19, 3, 25};

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
