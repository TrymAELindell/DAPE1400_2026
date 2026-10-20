import java.util.HashMap;
import javax.swing.JOptionPane;

// Reference solution for exercise 27 (Del 3): answer temperature queries
// per city until the user enters "ferdig".
public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> temperatureByCity = TemperatureRegister.createTemperatureMap();

        String city = JOptionPane.showInputDialog("Hvilken by? (ferdig avslutter)");
        while (!city.equals("ferdig")) {
            JOptionPane.showMessageDialog(null, TemperatureRegister.describeCity(temperatureByCity, city));
            city = JOptionPane.showInputDialog("Hvilken by? (ferdig avslutter)");
        }
    }
}
