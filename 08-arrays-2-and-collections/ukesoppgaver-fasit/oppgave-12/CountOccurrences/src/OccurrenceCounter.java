import java.util.ArrayList;

// Reference solution for exercise 12: count how many elements equal a value.
public class OccurrenceCounter {

    public static int countValue(ArrayList<Integer> numbers, int value) {
        int count = 0;
        for (Integer number : numbers) {
            if (number.equals(value)) {
                count++;
            }
        }
        return count;
    }
}
