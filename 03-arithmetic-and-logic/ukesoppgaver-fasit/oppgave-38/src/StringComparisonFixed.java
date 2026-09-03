import javax.swing.JOptionPane;

// Reference solution for exercise 38 - the corrected program.
// The bug: == on two strings compares them unreliably, so the condition was
// false whatever the user typed. Strings are compared with equals.
public class StringComparisonFixed {
    public static void main(String[] args) {
        String answer = JOptionPane.showInputDialog("Vil du fortsette? (ja/nei)");

        if (answer.equals("ja")) {
            System.out.println("Du svarte ja");
        } else {
            System.out.println("Du svarte nei");
        }
    }
}
