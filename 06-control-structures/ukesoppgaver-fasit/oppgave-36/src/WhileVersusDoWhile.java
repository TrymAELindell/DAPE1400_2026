// Reference solution for exercise 36: both snippets from the handout, runnable. The while
// loop tests before the first round and runs zero times; the do-while
// tests after and always gets exactly one round here.
public class WhileVersusDoWhile {
    public static void main(String[] args) {
        int number = 12;
        while (number < 10) {
            System.out.println("A: " + number);
            number++;
        }

        number = 12;
        do {
            System.out.println("B: " + number);
            number++;
        } while (number < 10);
    }
}
