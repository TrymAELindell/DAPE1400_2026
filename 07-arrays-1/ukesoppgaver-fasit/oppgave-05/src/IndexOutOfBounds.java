// Reference solution for exercise 5 (discovery drill). The program crashes on
// purpose: index 3 does not exist in an array of length 3.
public class IndexOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println(numbers[3]);
    }
}
