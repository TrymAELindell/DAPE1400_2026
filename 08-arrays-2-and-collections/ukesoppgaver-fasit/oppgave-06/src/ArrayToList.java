import java.util.ArrayList;

// Reference solution for exercise 6: convert an int array to an ArrayList and print it.
public class ArrayToList {

    public static ArrayList<Integer> toList(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> numberList = toList(numbers);

        for (int number : numberList) {
            System.out.println(number);
        }
    }
}
