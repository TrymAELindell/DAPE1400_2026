// Reference solution for exercise 17. The parameter is a copy of the reference,
// so the method changes the same array object that main holds.
public class ArrayDoubler {

    public static void doubleAll(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
    }
}
