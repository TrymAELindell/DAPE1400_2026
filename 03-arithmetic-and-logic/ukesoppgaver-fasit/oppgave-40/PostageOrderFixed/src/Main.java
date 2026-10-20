import javax.swing.JOptionPane;

// Reference solution for exercise 40 - the corrected program.
// The bug: the branches were in the wrong order. Java runs the first branch
// that is true, so weightKg < 5 caught every light parcel and the 90 kr
// branch was unreachable. The strictest limit has to come first.
public class Main {
    public static void main(String[] args) {
        String weightInput = JOptionPane.showInputDialog("Hvor mye veier pakken (kg)?");
        double weightKg;
        try {
            weightKg = Double.parseDouble(weightInput);
        } catch (Exception e) {
            weightKg = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — vekten er satt til 0 kg");
        }

        if (weightKg < 1) {
            System.out.println("Porto: 90 kr");
        } else if (weightKg < 5) {
            System.out.println("Porto: 150 kr");
        } else {
            System.out.println("Porto: 250 kr");
        }
    }
}
