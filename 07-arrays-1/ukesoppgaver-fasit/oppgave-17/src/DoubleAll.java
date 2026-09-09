// Reference solution for exercise 17. The parameter is a copy of the reference,
// so the method changes the same array object that main holds.
public class DoubleAll {

    public static void doubleAll(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        doubleAll(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
