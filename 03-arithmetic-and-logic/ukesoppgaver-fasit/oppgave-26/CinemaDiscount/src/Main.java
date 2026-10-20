import javax.swing.JOptionPane;

// Reference solution for exercise 26.
public class Main {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        String studentInput = JOptionPane.showInputDialog("Er du student? (ja/nei)");

        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            age = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — alderen er satt til 0");
        }
        boolean isStudent = studentInput.equals("ja");
        boolean isSenior = age > 67;

        System.out.println("Billetten koster 150 kr.");

        // One of the two is enough, so the operator is || and not &&.
        if (isStudent || isSenior) {
            System.out.println("Du har rett på rabatt.");
        }
    }
}
