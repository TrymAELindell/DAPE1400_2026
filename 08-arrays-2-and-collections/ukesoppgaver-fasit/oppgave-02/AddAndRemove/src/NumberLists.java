import java.util.ArrayList;

// Reference solution for exercise 2: build the list of the integers 1-9 and remove an element by
// its value.
public class NumberLists {

    public static ArrayList<Integer> createOneToNine() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    // remove(int) treats the parameter as an index, so we look the value up
    // with indexOf first and remove by that index.
    public static void removeValue(ArrayList<Integer> list, int value) {
        int index = list.indexOf(value);
        if (index != -1) {
            list.remove(index);
        }
    }
}
