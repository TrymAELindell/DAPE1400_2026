// Reference solution for exercise 42 (Del 4): what every vehicle in the register has.
public class Vehicle {
    private String model;
    private Date firstRegistered;
    private String licensePlate;

    public Vehicle(String model, Date firstRegistered, String licensePlate) {
        this.model = model;
        this.firstRegistered = firstRegistered;
        this.licensePlate = licensePlate;
    }

    public String toString() {
        return "Typebetegnelse : " + model + "\n"
                + "Førstegangsregistrert : " + firstRegistered + "\n"
                + "Kjennetegn : " + licensePlate;
    }
}
