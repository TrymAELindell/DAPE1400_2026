// Reference solution for exercise 13: the Address class, given in the handout.
public class Address {
    private String street;
    private String postalCode;
    private String city;

    public Address(String street, String postalCode, String city) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String toString() {
        return street + ", " + postalCode + " " + city;
    }
}
