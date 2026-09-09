// Reference solution for exercise 13. The cast to double (module 03) avoids
// integer division when computing the average.
public class EvenAverageForLoop {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= 98; i += 2) {
            sum += i;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Summen av partallene fra 0 til 98 er " + sum);
        System.out.println("Gjennomsnittet er " + average);
    }
}
