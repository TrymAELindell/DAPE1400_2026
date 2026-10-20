// Reference solution for exercise 31 (Del 2): the fixed aquarium.
public class Aquarium {
    private Heater heater;

    public Aquarium() {
        this.heater = new Heater(24);
    }

    public void setTemperature(double temperature) {
        if (temperature >= 22 && temperature <= 26) {
            heater.setTemperature(temperature);
        } else {
            System.out.println("Avvist: " + temperature + " grader er utenfor 22-26.");
        }
    }

    // getHeater er borte. Denne metoden svarer på spørsmålet i stedet for å gi
    // ut referansen til del-objektet.
    public double getTemperature() {
        return heater.getTemperature();
    }
}
