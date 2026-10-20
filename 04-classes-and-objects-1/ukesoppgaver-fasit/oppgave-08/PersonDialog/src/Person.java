// Reference solution for exercise 8. This is the finished class, after
// exercise 12; in exercise 7 the fields are not yet private and the
// constructor has no year check.
//
// setContactInfo takes both values because moving abroad changes the
// address and - with a local SIM card - usually the phone number too;
// allowing one to change without the other leaves the register with a mix
// of old and new contact information.
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private int birthYear;

    // calculateAge takes no parameters, so the current year has to live in
    // the object. Bump this when the course rolls over to a new year.
    private int currentYear = 2026;

    // Exercise 12: nobody is born in the future. The check runs before
    // anything is stored - the same shape as the Ticket constructor.
    public Person(String name, String address, String phoneNumber, int birthYear) {
        if (birthYear > this.currentYear) {
            System.out.println("Advarsel: fødselsåret kan ikke være i framtida. Personen ble ikke opprettet.");
        } else {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.birthYear = birthYear;
        }
    }

    public int calculateAge() {
        return this.currentYear - this.birthYear;
    }

    public void printPersonInfo(int age) {
        System.out.println(this.name + " med adresse " + this.address
                + " med telefonnummer " + this.phoneNumber
                + " er " + age + " år.");
    }

    // Exercise 8: the same information as one String, so it can go into a
    // message dialog.
    public String getPersonInfo(int age) {
        return "Navn: " + this.name
                + "\nAdresse: " + this.address
                + "\nTelefonnr: " + this.phoneNumber
                + "\nAlder: " + age + " år";
    }

    // Exercise 10: address and phone number are changed together, never singly.
    public void setContactInfo(String address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    // Exercise 11: birthYear has a getter but deliberately no setter, which is
    // what makes it impossible to change from the outside once the object
    // exists. A person's year of birth does not change.
    public int getBirthYear() {
        return this.birthYear;
    }

    // There is deliberately no getAddress or getPhoneNumber. The handout does
    // not ask for them, and the chapter's point is that getters are written
    // where the class should let something be read -- not one per field.
}
