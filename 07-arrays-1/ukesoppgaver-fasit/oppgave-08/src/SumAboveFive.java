// Reference solution for exercise 8. int / int would give 7 here — the cast to
// double is what keeps the correct 7.5.
public class SumAboveFive {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 5) {
                sum += numbers[i];
                count++;
            }
        }
        double average = (double) sum / count;

        System.out.println("Summen av tallene større enn 5 er " + sum);
        System.out.println("Gjennomsnittet av dem er " + average);
    }
}
