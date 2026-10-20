// Reference solution for exercise 21: parameters with the same name as the field.
public class Thermostat {
    private int temperature;

    public Thermostat(int temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
