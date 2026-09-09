// Reference solution for exercise 17.
public class EvenAverageWhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 0;
        while (i <= 98) {
            sum += i;
            count++;
            i += 2;
        }
        double average = (double) sum / count;
        System.out.println("Summen av partallene fra 0 til 98 er " + sum);
        System.out.println("Gjennomsnittet er " + average);
    }
}
