import javax.swing.JOptionPane;

// Reference solution for exercise 1: read the data, create an object, show it.
public class PersonMain {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Fornavn:");
        String lastName = JOptionPane.showInputDialog("Etternavn:");
        String address = JOptionPane.showInputDialog("Adresse:");
        String phoneNumber = JOptionPane.showInputDialog("Telefonnr:");

        Person person = new Person(firstName, lastName, address, phoneNumber);
        person.showPersonInfo();
    }
}
