import javax.swing.JOptionPane;

// Reference solution for exercise 31: check-in, printout, contact update.
public class DogKennelMain {
    public static void main(String[] args) {
        // Assumption: the program handles one dog per run - the brief talks
        // about one check-in at a time.
        String dogName = JOptionPane.showInputDialog("Hva heter hunden?");
        String contactName = JOptionPane.showInputDialog("Hvem eier hunden?");
        String contactPhone = JOptionPane.showInputDialog("Hvilket telefonnummer skal ringes?");

        Dog dog = new Dog(dogName, contactName, contactPhone);
        dog.printCheckInInfo("Innsjekk registrert:");

        // Assumption: the contact update happens in the same run, right
        // after check-in - the brief doesn't say when "i ferien" is.
        String newContactName = JOptionPane.showInputDialog("Ny kontaktperson:");
        String newContactPhone = JOptionPane.showInputDialog("Nytt telefonnummer:");

        // Both values at once - there is no way to change only one of them.
        dog.setContactInfo(newContactName, newContactPhone);

        System.out.println();
        dog.printCheckInInfo("Kontakt oppdatert:");

        // Assumption: no validation of the phone number - the brief doesn't
        // say what a valid number looks like, so anything Ingrid types is
        // accepted.
    }
}
