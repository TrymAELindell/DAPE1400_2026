import java.util.ArrayList;

// Reference solution for exercise 1: build the list of the integers 1-9.
public class NumberLists {

    public static ArrayList<Integer> createOneToNine() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
