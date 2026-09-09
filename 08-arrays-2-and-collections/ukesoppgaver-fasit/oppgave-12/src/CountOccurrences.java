import java.util.ArrayList;

// Reference solution for exercise 12: count how many elements equal 4 with a for-each loop and
// equals — exercise 11 showed why == is the wrong comparison here.
public class CountOccurrences {

    public static int countValue(ArrayList<Integer> numbers, int value) {
        int count = 0;
        for (Integer number : numbers) {
            if (number.equals(value)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(4);
        numbers.add(2);
        numbers.add(4);
        numbers.add(9);
        numbers.add(7);

        System.out.println("Antall 4-ere: " + countValue(numbers, 4));
    }
}
