import java.util.ArrayList;

// Reference solution for exercise 6: convert an int array to an ArrayList.
public class ListConverter {

    public static ArrayList<Integer> toList(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }
}
