// Reference solution for exercise 37: the snippet from the handout, runnable. The printout
// happens before the doubling, so 800 is computed but never printed.
public class DoublingDoWhile {
    public static void main(String[] args) {
        int amount = 100;
        do {
            System.out.println(amount);
            amount *= 2;
        } while (amount <= 400);
    }
}
