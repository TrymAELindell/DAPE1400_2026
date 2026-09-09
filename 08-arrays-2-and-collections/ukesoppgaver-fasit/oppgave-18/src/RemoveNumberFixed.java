import java.util.ArrayList;

// Reference solution for exercise 18 (Del 2): the fixed version of the buggy snippet. remove(2)
// with an int argument removes by index, so the value has to be located
// with indexOf first.
public class RemoveNumberFixed {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        int index = numbers.indexOf(2);
        numbers.remove(index);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
