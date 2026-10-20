// Reference solution for exercise 4. The last element is reached through
// numbers.length - 1, so the code works whatever the array length is.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        numbers[1] = 20;
        numbers[numbers.length - 1] = 90;

        System.out.println("Andre element: " + numbers[1]);
        System.out.println("Siste element: " + numbers[numbers.length - 1]);
    }
}
