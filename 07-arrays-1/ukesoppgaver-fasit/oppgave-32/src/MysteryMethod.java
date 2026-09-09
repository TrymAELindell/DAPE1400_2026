// Reference solution for exercise 32: the program from the handout, runnable. The method
// finds and returns the smallest number in the array.
public class MysteryMethod {
    public static int mystery(int[] numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] measurements = {12, 7, 19, 3, 8};
        System.out.println(mystery(measurements));
    }
}
