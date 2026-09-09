import java.util.ArrayList;
import java.util.Collections;

// Reference solution for exercise 9: sort a list of integers, reverse it, and print the largest
// and smallest element with Collections.max and Collections.min.
public class SortNumbersStats {

    public static void printOnOneLine(String heading, ArrayList<Integer> list) {
        System.out.print(heading);
        for (int number : list) {
            System.out.print(" " + number);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(7);
        numbers.add(19);
        numbers.add(3);
        numbers.add(25);

        Collections.sort(numbers);
        printOnOneLine("Stigende:", numbers);

        Collections.reverse(numbers);
        printOnOneLine("Synkende:", numbers);

        System.out.println("Størst: " + Collections.max(numbers));
        System.out.println("Minst: " + Collections.min(numbers));
    }
}
