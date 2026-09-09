import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 23: the greeting is printed before the condition
// is ever tested, so it always appears at least once.
public class RepeatGreeting {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.println("Hei!");
            answer = showInputDialog("En gang til? (j/n)");
        } while (answer.equals("j"));
    }
}
