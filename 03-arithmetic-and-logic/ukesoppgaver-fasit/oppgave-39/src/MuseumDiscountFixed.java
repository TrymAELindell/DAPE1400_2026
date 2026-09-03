import javax.swing.JOptionPane;

// Reference solution for exercise 39 - the corrected program.
// The bug: && required the visitor to be a student AND over 67 at the same
// time. The museum meant either group, which is ||.
public class MuseumDiscountFixed {
    public static void main(String[] args) {
        String studentInput = JOptionPane.showInputDialog("Er du student? (ja/nei)");
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        int age = Integer.parseInt(ageInput);

        boolean isStudent = studentInput.equals("ja");
        boolean isSenior = age > 67;

        if (isStudent || isSenior) {
            System.out.println("Du kommer inn gratis");
        } else {
            System.out.println("Billetten koster 120 kr");
        }
    }
}
