import javax.swing.JOptionPane;

// Reference solution for exercise 6.
public class AgeAsNumber {
    public static void main(String[] args) {
        // Input always arrives as a String, so reading a whole number is a
        // two-step pattern: read the String, then convert with parseInt.
        String ageInput = JOptionPane.showInputDialog("Skriv inn alderen din (heltall)");
        int age = Integer.parseInt(ageInput);

        JOptionPane.showMessageDialog(null, "Min alder er " + age + " år.");
    }
}
