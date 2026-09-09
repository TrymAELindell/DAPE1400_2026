import java.util.HashMap;
import javax.swing.JOptionPane;

// Reference solution for exercise 27 (Del 3): answer temperature queries
// per city until the user enters "ferdig".
public class CityTemperatureLookup {

    // A HashMap fits here: every question is "what pairs with this city?",
    // which is the map's native operation, and containsKey answers the
    // unknown-city case directly. Two parallel arrays — one of cities, one
    // of temperatures joined by index — also work, but every lookup then
    // needs a hand-written search, and the pairing survives only as long
    // as both arrays are kept in step by hand.
    public static HashMap<String, Integer> createTemperatureMap() {
        HashMap<String, Integer> temperatureByCity = new HashMap<>();
        temperatureByCity.put("Oslo", 4);
        temperatureByCity.put("Bergen", 7);
        temperatureByCity.put("Trondheim", 2);
        temperatureByCity.put("Tromsø", -3);
        return temperatureByCity;
    }

    public static String describeCity(HashMap<String, Integer> temperatureByCity, String city) {
        if (temperatureByCity.containsKey(city)) {
            return "I " + city + " er det " + temperatureByCity.get(city) + " grader";
        }
        return "Har ingen måling for " + city;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> temperatureByCity = createTemperatureMap();

        String city = JOptionPane.showInputDialog("Hvilken by? (ferdig avslutter)");
        while (!city.equals("ferdig")) {
            JOptionPane.showMessageDialog(null, describeCity(temperatureByCity, city));
            city = JOptionPane.showInputDialog("Hvilken by? (ferdig avslutter)");
        }
    }
}
