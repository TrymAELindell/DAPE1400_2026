import javax.swing.JOptionPane;

// Reference solution for exercise 24.
public class Main {
    public static void main(String[] args) {
        String pointsInput = JOptionPane.showInputDialog("Hvor mange poeng fikk du?");
        int points;
        try {
            points = Integer.parseInt(pointsInput);
        } catch (Exception e) {
            points = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — poengsummen er satt til 0");
        }

        int passMark = 40;

        if (points >= passMark) {
            JOptionPane.showMessageDialog(null, "Du fikk " + points + " poeng. Bestått!");
        } else {
            JOptionPane.showMessageDialog(null, "Du fikk " + points + " poeng. Ikke bestått.");
        }
    }
}
