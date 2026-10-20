import java.util.ArrayList;

// Reference solution for exercise 2: add 10 and 11 to the list, remove the
// elements with the values 2 and 3, then print the list with a for loop
// using size().
//
// Listen er den samme som i oppgave 1.
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = NumberLists.createOneToNine();

        numbers.add(10);
        numbers.add(11);

        NumberLists.removeValue(numbers, 2);
        NumberLists.removeValue(numbers, 3);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
