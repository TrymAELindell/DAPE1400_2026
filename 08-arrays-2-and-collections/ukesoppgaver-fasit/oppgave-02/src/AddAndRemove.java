import java.util.ArrayList;

// Reference solution for exercise 2: add 10 and 11 to the list from exercise 1, remove the elements
// with the values 2 and 3, then print the list with a for loop using size().
public class AddAndRemove {

    // remove(int) treats the parameter as an index, so we look the value up
    // with indexOf first and remove by that index.
    public static void removeValue(ArrayList<Integer> list, int value) {
        int index = list.indexOf(value);
        if (index != -1) {
            list.remove(index);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = PrintListElements.createOneToNine();

        numbers.add(10);
        numbers.add(11);

        removeValue(numbers, 2);
        removeValue(numbers, 3);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
