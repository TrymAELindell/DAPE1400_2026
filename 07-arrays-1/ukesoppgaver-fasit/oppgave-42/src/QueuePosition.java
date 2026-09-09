// Reference solution for exercise 42.
//
// Fasit comment (the choice): this solution stores the queue in an
// array and stops a for loop with break at Jonas, so the counter holds
// how many people stand before him. Another good solution is a while
// loop whose condition is «not yet Jonas»; there the counting sits in
// two places, and both places must change together.
public class QueuePosition {
    public static void main(String[] args) {
        String[] queue = {"Piotr", "Amina", "Jonas", "Sara"};

        int position = 0;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i].equals("Jonas")) {
                position = i;
                break;
            }
        }

        System.out.println(position + " personer står foran Jonas");
    }
}
