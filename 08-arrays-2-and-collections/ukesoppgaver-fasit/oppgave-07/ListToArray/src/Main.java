import java.util.ArrayList;

// Reference solution for exercise 7: convert an ArrayList of integers to a plain int array and
// print it.
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = NumberLists.createOneToNine();

        int[] numbers = ListConverter.toArray(numberList);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
