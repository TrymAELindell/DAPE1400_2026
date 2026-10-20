import java.util.ArrayList;

// Reference solution for exercise 12: count how many elements equal 4 with a
// for-each loop and equals.
//
// Oppgave 11 viste hvorfor == er feil sammenlikning her.
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(4);
        numbers.add(2);
        numbers.add(4);
        numbers.add(9);
        numbers.add(7);

        System.out.println("Antall 4-ere: " + OccurrenceCounter.countValue(numbers, 4));
    }
}
