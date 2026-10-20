import java.util.HashMap;

// Reference solution for exercise 19 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. Den skriver ut 2 og Norway. Keyene er
// unike, så den andre put på "Gardermoen" erstatter den gamle verdien i
// stedet for å legge til et nytt par.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> airportInCountryMap = new HashMap<>();
        airportInCountryMap.put("Gardermoen", "Norge");
        airportInCountryMap.put("Gatwick", "United Kingdom");
        airportInCountryMap.put("Gardermoen", "Norway");

        System.out.println(airportInCountryMap.size());
        System.out.println(airportInCountryMap.get("Gardermoen"));
    }
}
