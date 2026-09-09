import javax.swing.JOptionPane;

// Reference solution for exercise 8.
public class PersonDialogMain {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Navn:");
        String address = JOptionPane.showInputDialog("Adresse:");
        String phoneNumber = JOptionPane.showInputDialog("Telefonnr:");
        int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Fødselsår:"));

        Person person = new Person(name, address, phoneNumber, birthYear);
        int age = person.calculateAge();

        JOptionPane.showMessageDialog(null, person.getPersonInfo(age));
    }
}
