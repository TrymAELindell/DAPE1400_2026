// Reference solution for exercise 17: the car from exercise 11, with toString.
public class Car {
    private String registrationNumber;

    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String toString() {
        return registrationNumber;
    }
}
