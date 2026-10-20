import java.util.HashMap;

// Reference solution for exercise 13: build the airport register and describe one airport.
public class AirportRegister {

    public static HashMap<String, String> createAirportMap() {
        HashMap<String, String> airportInCountryMap = new HashMap<>();
        airportInCountryMap.put("Gardermoen", "Norway");
        airportInCountryMap.put("Gatwick", "United Kingdom");
        airportInCountryMap.put("Schiphol", "Netherlands");
        return airportInCountryMap;
    }

    public static String describeAirport(HashMap<String, String> airportMap, String airport) {
        if (airportMap.containsKey(airport)) {
            return airport + " ligger i " + airportMap.get(airport);
        } else {
            return "Flyplassen " + airport + " finnes ikke i registeret";
        }
    }
}
