// Reference solution for exercise 11 (discovery drill). The loop variable holds
// a copy of the element, so the array stays unchanged.
public class ForEachNoChange {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        for (int number : numbers) {
            number = number * 2;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
