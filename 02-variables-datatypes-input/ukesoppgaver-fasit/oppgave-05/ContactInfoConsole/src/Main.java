import javax.swing.JOptionPane;

// Reference solution for exercise 5.
public class Main {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Skriv inn fornavnet ditt");
        String lastName = JOptionPane.showInputDialog("Skriv inn etternavnet ditt");
        String age = JOptionPane.showInputDialog("Skriv inn alderen din");
        String address = JOptionPane.showInputDialog("Skriv inn adressen din");
        String postalCode = JOptionPane.showInputDialog("Skriv inn postnummeret ditt");
        String city = JOptionPane.showInputDialog("Skriv inn poststedet ditt");

        // Same output as exercise 4, but printed to the terminal instead of
        // a message dialog. \n works the same way in both.
        String output = "Navn: " + firstName + " " + lastName
                + "\nAdresse: " + address
                + "\nPostnummer: " + postalCode
                + "\nPoststed: " + city
                + "\nAlder: " + age + " år";
        System.out.println(output);
    }
}
