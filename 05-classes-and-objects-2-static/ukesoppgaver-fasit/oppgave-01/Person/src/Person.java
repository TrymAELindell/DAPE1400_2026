import javax.swing.JOptionPane;

// Reference solution for exercise 1.
// The static counter and personNumber field belong to exercise 8.
public class Person {
    private static int personsRegistered = 0;

    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private int personNumber;

    public Person(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;

        personsRegistered++;
        this.personNumber = personsRegistered;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonNumber() {
        return this.personNumber;
    }

    // Static getter: belongs to the class, not to any single object.
    public static int getPersonsRegistered() {
        return personsRegistered;
    }

    public void showPersonInfo() {
        JOptionPane.showMessageDialog(null,
                "Fornavn: " + this.firstName
                        + "\nEtternavn: " + this.lastName
                        + "\nAdresse: " + this.address
                        + "\nTelefonnr: " + this.phoneNumber);
    }
}
