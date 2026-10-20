import javax.swing.JOptionPane;

// Reference solution for exercise 30.
public class Main {
    public static void main(String[] args) {
        String pointsInput = JOptionPane.showInputDialog("Hvor mange poeng fikk du (0-100)?");
        int points;
        try {
            points = Integer.parseInt(pointsInput);
        } catch (Exception e) {
            points = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — poengsummen er satt til 0");
        }

        String grade;

        // The branches run from the highest limit down. Once a branch is
        // reached, everything above it has already been ruled out.
        if (points >= 89) {
            grade = "A";
        } else if (points >= 77) {
            grade = "B";
        } else if (points >= 65) {
            grade = "C";
        } else if (points >= 53) {
            grade = "D";
        } else if (points >= 41) {
            grade = "E";
        } else {
            grade = "F";
        }

        JOptionPane.showMessageDialog(null, points + " poeng gir karakteren " + grade + ".");
    }
}
