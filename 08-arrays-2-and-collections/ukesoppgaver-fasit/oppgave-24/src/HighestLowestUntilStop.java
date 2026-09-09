import javax.swing.JOptionPane;

// Reference solution for exercise 24 (Del 3): the highest and lowest of
// the integers the user enters, until -1 ends the input.
public class HighestLowestUntilStop {

    public static void main(String[] args) {
        // Two tracking variables in the do-while from module 06 fit here:
        // the job only ever needs the biggest and smallest value seen so
        // far, so nothing else is worth keeping. An ArrayList feeding
        // Collections.max and Collections.min at the end also works, but
        // it stores every number the job will never look at again — the
        // list buys generality this job does not use.
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        boolean anyNumberEntered = false;

        int number;
        do {
            number = Integer.parseInt(
                    JOptionPane.showInputDialog("Skriv inn et heltall (-1 avslutter):"));
            if (number != -1) {
                anyNumberEntered = true;
                if (number > highest) {
                    highest = number;
                }
                if (number < lowest) {
                    lowest = number;
                }
            }
        } while (number != -1);

        if (anyNumberEntered) {
            System.out.println("Størst: " + highest);
            System.out.println("Minst: " + lowest);
        }
    }
}
