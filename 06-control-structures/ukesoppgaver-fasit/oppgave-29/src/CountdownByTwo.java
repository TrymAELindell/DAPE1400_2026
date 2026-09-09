// Reference solution for exercise 29: the snippet from the handout, runnable. The loop
// counts down in steps of 2, and 0 is never printed — the condition i > 0
// is false by then.
public class CountdownByTwo {
    public static void main(String[] args) {
        int i = 6;
        while (i > 0) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println("Ferdig!");
    }
}
