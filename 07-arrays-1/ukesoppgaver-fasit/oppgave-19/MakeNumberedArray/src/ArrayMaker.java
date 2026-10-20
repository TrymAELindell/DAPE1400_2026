// Reference solution for exercise 19. The return value is a reference to the
// array the method created.
public class ArrayMaker {

    public static int[] makeNumberedArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
