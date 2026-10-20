// Reference solution for exercise 14: a method that changes an array it gets as parameter,
// and an overloaded variant with a different return type.
public class ArrayUtils {

    public static void doubleAll(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
    }

    public static int doubleAll(int number) {
        return number * 2;
    }
}
