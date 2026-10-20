import java.util.HashMap;
import javax.swing.JOptionPane;

// Reference solution for exercise 13: look up which country an airport is in with a
// HashMap, and handle airports that are not in the map.
public class Main {

    public static void main(String[] args) {
        HashMap<String, String> airportMap = AirportRegister.createAirportMap();

        String airport = JOptionPane.showInputDialog("Hvilken flyplass vil du slå opp?");
        JOptionPane.showMessageDialog(null, AirportRegister.describeAirport(airportMap, airport));
    }
}
