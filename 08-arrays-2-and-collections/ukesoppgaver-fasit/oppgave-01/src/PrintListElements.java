import java.util.ArrayList;

// Reference solution for exercise 1: create an ArrayList of the integers 1-9 and print the third
// and sixth element.
public class PrintListElements {

    public static ArrayList<Integer> createOneToNine() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = createOneToNine();

        // The third element is at index 2, the sixth at index 5.
        System.out.println("Tredje element: " + numbers.get(2));
        System.out.println("Sjette element: " + numbers.get(5));
    }
}
