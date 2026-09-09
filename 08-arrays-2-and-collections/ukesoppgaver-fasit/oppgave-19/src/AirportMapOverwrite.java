import java.util.HashMap;

// Reference solution for exercise 19 (Del 2): the snippet from the handout, runnable. Prints 2
// and Norway — keys are unique, so the second put on "Gardermoen"
// overwrites the old value instead of adding a pair.
public class AirportMapOverwrite {
    public static void main(String[] args) {
        HashMap<String, String> airportInCountryMap = new HashMap<>();
        airportInCountryMap.put("Gardermoen", "Norge");
        airportInCountryMap.put("Gatwick", "United Kingdom");
        airportInCountryMap.put("Gardermoen", "Norway");

        System.out.println(airportInCountryMap.size());
        System.out.println(airportInCountryMap.get("Gardermoen"));
    }
}
