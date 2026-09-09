import static javax.swing.JOptionPane.showInputDialog;

public class RocketCountdownV2 {
    public static void main(String[] args) {
        String userInput = showInputDialog("Start nedtelling fra:");
        int countFrom = Integer.parseInt(userInput);

        // A for loop is often tidier than a while loop because it gathers
        // all the information about how the loop iterates on one line:
        // inside the parentheses below we initialize the counter variable
        // currentCount as an int, state the loop condition, and finally
        // say how the counter variable changes — all in one place.
        // When we know how many iterations we need, as here where we count
        // down from a given number, a for loop is usually the best choice.
        for (int currentCount = countFrom; currentCount > 0; currentCount--) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
