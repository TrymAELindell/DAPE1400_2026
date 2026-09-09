import java.util.ArrayList;

// Reference solution for exercise 7: convert an ArrayList of integers to a plain int array and
// print it.
public class ListToArray {

    public static int[] toArray(ArrayList<Integer> list) {
        int[] numbers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            numbers[i] = list.get(i);
        }
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numberList = PrintListElements.createOneToNine();

        int[] numbers = toArray(numberList);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
