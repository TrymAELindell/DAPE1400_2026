import javax.swing.JOptionPane;

// Reference solution for exercise 8.
public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Navn:");
        String address = JOptionPane.showInputDialog("Adresse:");
        String phoneNumber = JOptionPane.showInputDialog("Telefonnr:");
        String birthYearInput = JOptionPane.showInputDialog("Fødselsår:");
        int birthYear;
        try {
            birthYear = Integer.parseInt(birthYearInput);
        } catch (Exception e) {
            // Backup value 2026, not 0: with 0 the person would be 2026 years old.
            birthYear = 2026;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et årstall — fødselsåret er satt til 2026");
        }

        Person person = new Person(name, address, phoneNumber, birthYear);
        int age = person.calculateAge();

        JOptionPane.showMessageDialog(null, person.getPersonInfo(age));
    }
}
