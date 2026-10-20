import java.util.HashMap;

// Reference solution for exercise 14: build the extended airport register.
public class AirportRegister {

    public static HashMap<String, String> createAirportMap() {
        HashMap<String, String> airportInCountryMap = new HashMap<>();
        airportInCountryMap.put("Gardermoen", "Norway");
        airportInCountryMap.put("Gatwick", "United Kingdom");
        airportInCountryMap.put("Schiphol", "Netherlands");
        return airportInCountryMap;
    }

    public static HashMap<String, String> createExtendedRegister() {
        HashMap<String, String> airportInCountryMap = createAirportMap();
        airportInCountryMap.put("Kastrup", "Denmark");
        airportInCountryMap.put("Arlanda", "Sweden");
        return airportInCountryMap;
    }
}
