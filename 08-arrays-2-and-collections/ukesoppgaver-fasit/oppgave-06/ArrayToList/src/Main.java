import java.util.ArrayList;

// Reference solution for exercise 6: convert an int array to an ArrayList and print it.
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> numberList = ListConverter.toList(numbers);

        for (int number : numberList) {
            System.out.println(number);
        }
    }
}
