import javax.swing.JOptionPane;

// Reference solution for exercise 24.
public class ExamResult {
    public static void main(String[] args) {
        String pointsInput = JOptionPane.showInputDialog("Hvor mange poeng fikk du?");
        int points = Integer.parseInt(pointsInput);

        int passMark = 40;

        if (points >= passMark) {
            JOptionPane.showMessageDialog(null, "Du fikk " + points + " poeng. Bestått!");
        } else {
            JOptionPane.showMessageDialog(null, "Du fikk " + points + " poeng. Ikke bestått.");
        }
    }
}
