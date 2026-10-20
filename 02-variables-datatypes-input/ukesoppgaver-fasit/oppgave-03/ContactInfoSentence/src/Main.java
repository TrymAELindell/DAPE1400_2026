import javax.swing.JOptionPane;

// Reference solution for exercise 3.
public class Main {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Skriv inn fornavnet ditt");
        String lastName = JOptionPane.showInputDialog("Skriv inn etternavnet ditt");
        String age = JOptionPane.showInputDialog("Skriv inn alderen din");
        String address = JOptionPane.showInputDialog("Skriv inn adressen din");
        String postalCode = JOptionPane.showInputDialog("Skriv inn postnummeret ditt");
        String city = JOptionPane.showInputDialog("Skriv inn poststedet ditt");

        String fullName = firstName + " " + lastName;
        String output = fullName + " bor i " + address + " som har postnummer "
                + postalCode + " i " + city + ". Alderen til " + firstName
                + " er " + age + " år.";
        JOptionPane.showMessageDialog(null, output);
    }
}
