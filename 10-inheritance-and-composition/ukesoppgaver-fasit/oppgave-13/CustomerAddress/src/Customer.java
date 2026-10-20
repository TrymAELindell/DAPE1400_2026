// Reference solution for exercise 13: a customer has an address.
public class Customer {
    private String name;
    private Address address;

    public Customer(String name, String street, String postalCode, String city) {
        this.name = name;
        this.address = new Address(street, postalCode, city);
    }

    public String toString() {
        return name + ", " + address;
    }
}
