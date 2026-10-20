// Reference solution for exercise 42 (Del 4): a car is a vehicle with a load capacity.
public class Car extends Vehicle {
    private int loadCapacity;

    public Car(String model, Date firstRegistered, String licensePlate, int loadCapacity) {
        super(model, firstRegistered, licensePlate);
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return super.toString() + "\n" + "Lastekapasitet : " + loadCapacity + " kg";
    }
}
