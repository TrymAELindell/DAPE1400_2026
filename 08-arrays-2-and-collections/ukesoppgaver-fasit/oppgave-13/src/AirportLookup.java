import java.util.HashMap;
import javax.swing.JOptionPane;

// Reference solution for exercise 13: look up which country an airport is in with a
// HashMap, and handle airports that are not in the map.
public class AirportLookup {

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

    public static void main(String[] args) {
        HashMap<String, String> airportMap = createAirportMap();

        String airport = JOptionPane.showInputDialog("Hvilken flyplass vil du slå opp?");
        JOptionPane.showMessageDialog(null, describeAirport(airportMap, airport));
    }
}
