import javax.swing.JOptionPane;

// Reference solution for exercise 26.
public class CinemaDiscount {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        String studentInput = JOptionPane.showInputDialog("Er du student? (ja/nei)");

        int age = Integer.parseInt(ageInput);
        boolean isStudent = studentInput.equals("ja");
        boolean isSenior = age > 67;

        System.out.println("Billetten koster 150 kr.");

        // One of the two is enough, so the operator is || and not &&.
        if (isStudent || isSenior) {
            System.out.println("Du har rett på rabatt.");
        }
    }
}
