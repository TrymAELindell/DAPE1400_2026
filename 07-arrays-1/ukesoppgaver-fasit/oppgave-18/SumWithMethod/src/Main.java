// Reference solution for exercise 18.
public class Main {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] second = {40, 25, 20, 15};

        System.out.println("Summen av den første arrayen er " + SumCalculator.calculateSum(first));
        System.out.println("Summen av den andre arrayen er " + SumCalculator.calculateSum(second));
    }
}
