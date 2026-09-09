// Reference solution for exercise 15.
public class SumWhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i <= 9) {
            sum += i;
            i++;
        }
        System.out.println("Summen av tallene fra 0 til 9 er " + sum);
    }
}
