// Reference solution for exercise 30: the snippet from the handout, runnable. The bound
// i < 5 keeps 5 itself out of the sum: 1 + 2 + 3 + 4 = 10.
public class SmallSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 5; i++) {
            sum += i;
        }
        System.out.println("Summen er " + sum);
    }
}
