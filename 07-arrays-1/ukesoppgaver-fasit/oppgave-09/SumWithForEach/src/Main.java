// Reference solution for exercise 9.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Summen er " + sum);
    }
}
