// Reference solution for exercise 39.
//
// Fasit comment (the choice): this solution stores the numbers in an
// array and counts with a for-each loop, because the count needs each
// value and nothing else. Another good solution is a normal for loop
// with an index; the index is extra code that the task never uses.
public class EvenOddCounter {
    public static void main(String[] args) {
        int[] numbers = {45, 34, 5, 8, 10, 2, 13, 25};

        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Antall partall: " + evenCount);
        System.out.println("Antall oddetall: " + oddCount);
    }
}
