import javax.swing.JOptionPane;

// Reference solution for exercise 4.
public class ContactInfoFormatted {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Skriv inn fornavnet ditt");
        String lastName = JOptionPane.showInputDialog("Skriv inn etternavnet ditt");
        String age = JOptionPane.showInputDialog("Skriv inn alderen din");
        String address = JOptionPane.showInputDialog("Skriv inn adressen din");
        String postalCode = JOptionPane.showInputDialog("Skriv inn postnummeret ditt");
        String city = JOptionPane.showInputDialog("Skriv inn poststedet ditt");

        // \n gives a line break, so each piece of information gets its own line.
        String output = "Navn: " + firstName + " " + lastName
                + "\nAdresse: " + address
                + "\nPostnummer: " + postalCode
                + "\nPoststed: " + city
                + "\nAlder: " + age + " år";
        JOptionPane.showMessageDialog(null, output);
    }
}
