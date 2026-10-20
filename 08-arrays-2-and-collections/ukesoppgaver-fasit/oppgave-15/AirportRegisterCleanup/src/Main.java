import java.util.HashMap;

// Reference solution for exercise 15: remove Gatwick only if containsKey says it is there, print
// the remaining airports with a for-each loop over keySet(), then shut
// the register down with clear.
public class Main {

    public static void main(String[] args) {
        HashMap<String, String> airportInCountryMap = AirportRegister.createExtendedRegister();
        airportInCountryMap.remove("Schiphol");

        if (airportInCountryMap.containsKey("Gatwick")) {
            airportInCountryMap.remove("Gatwick");
            System.out.println("Gatwick fjernet");
        }
        for (String airport : airportInCountryMap.keySet()) {
            System.out.println(airport);
        }
        System.out.println("Antall flyplasser: " + airportInCountryMap.size());

        airportInCountryMap.clear();
        System.out.println("Antall flyplasser: " + airportInCountryMap.size());
    }
}
