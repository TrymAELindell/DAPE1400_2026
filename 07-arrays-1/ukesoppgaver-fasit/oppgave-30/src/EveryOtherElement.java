// Reference solution for exercise 30: the snippet from the handout, runnable. The loop
// starts at index 1 and moves two steps per round: indexes 1, 3 and 5.
public class EveryOtherElement {
    public static void main(String[] args) {
        int[] values = {4, 8, 15, 16, 23, 42};

        for (int i = 1; i < values.length; i += 2) {
            System.out.println(values[i]);
        }
    }
}
