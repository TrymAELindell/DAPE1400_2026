import java.util.ArrayList;

// Reference solution for exercise 7: convert an ArrayList of integers to an int array.
public class ListConverter {

    public static int[] toArray(ArrayList<Integer> list) {
        int[] numbers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            numbers[i] = list.get(i);
        }
        return numbers;
    }
}
