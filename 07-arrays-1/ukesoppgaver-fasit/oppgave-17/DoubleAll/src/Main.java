// Reference solution for exercise 17. Doubles every element, then prints the
// array.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        ArrayDoubler.doubleAll(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
