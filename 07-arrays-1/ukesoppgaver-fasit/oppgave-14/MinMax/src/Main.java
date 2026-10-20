// Reference solution for exercise 14. Starting both at the first element means
// the code also works when every number is negative.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {45, 34, 5, 8, 10, 2, 13, 25};

        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Største tall: " + largest);
        System.out.println("Minste tall: " + smallest);
    }
}
