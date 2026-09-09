// Reference solution for exercise 7. The cast to double happens before the
// division, so the average keeps its decimals.
public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;

        System.out.println("Summen er " + sum);
        System.out.println("Gjennomsnittet er " + average);
    }
}
