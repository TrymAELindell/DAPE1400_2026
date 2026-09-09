import java.util.HashMap;

// Reference solution for exercise 14: extend the airport register — put two more pairs, check
// with containsKey, remove one with remove(key), print every pair with a
// for-each loop over keySet(), and report size().
public class AirportRegisterExtended {

    public static HashMap<String, String> createExtendedRegister() {
        HashMap<String, String> airportInCountryMap = AirportLookup.createAirportMap();
        airportInCountryMap.put("Kastrup", "Denmark");
        airportInCountryMap.put("Arlanda", "Sweden");
        return airportInCountryMap;
    }

    public static void main(String[] args) {
        HashMap<String, String> airportInCountryMap = createExtendedRegister();

        System.out.println("Torp i registeret: "
                + airportInCountryMap.containsKey("Torp"));

        airportInCountryMap.remove("Schiphol");

        for (String airport : airportInCountryMap.keySet()) {
            System.out.println(airport + " ligger i "
                    + airportInCountryMap.get(airport));
        }

        System.out.println("Antall flyplasser: " + airportInCountryMap.size());
    }
}
