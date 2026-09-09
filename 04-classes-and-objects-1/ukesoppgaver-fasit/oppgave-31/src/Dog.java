// Reference solution for exercise 31 (Ingrid's kennel).
//
// The brief maps onto this week's tools: the three noted things are fields;
// "legge inn ... når hunden kommer" is the constructor; "få dem pent opp
// igjen" is the printout; "både nytt navn og nytt nummer samtidig" is one
// setter that takes both; "ingen kan tukle med" the dog's name is a field
// with no setter.
public class Dog {
    private String name;
    private String contactName;
    private String contactPhone;

    public Dog(String name, String contactName, String contactPhone) {
        this.name = name;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    // The contact person and the phone number change together - Ingrid's
    // "ellers ender jeg med å ringe riktig person på feil nummer".
    public void setContactInfo(String contactName, String contactPhone) {
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    // The dog's name has no setter: it is fixed at check-in, like the sign
    // on the cage.
    public String getName() {
        return this.name;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }

    public void printCheckInInfo(String heading) {
        System.out.println(heading);
        System.out.println("Hund: " + this.name);
        System.out.println("Eier: " + this.contactName);
        System.out.println("Telefon: " + this.contactPhone);
    }
}
