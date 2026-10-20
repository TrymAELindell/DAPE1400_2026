// Reference solution for exercise 19. Makes an array of length 5 and prints it.
public class Main {
    public static void main(String[] args) {
        int[] numbers = ArrayMaker.makeNumberedArray(5);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
