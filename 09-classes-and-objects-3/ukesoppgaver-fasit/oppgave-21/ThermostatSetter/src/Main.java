// Reference solution for exercise 21: create a thermostat and change its temperature.
public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(20);
        System.out.println("Temperatur: " + thermostat.getTemperature());

        thermostat.setTemperature(23);
        System.out.println("Temperatur: " + thermostat.getTemperature());
    }
}
