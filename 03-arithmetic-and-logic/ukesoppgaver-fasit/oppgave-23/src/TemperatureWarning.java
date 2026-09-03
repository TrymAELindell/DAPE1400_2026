import javax.swing.JOptionPane;

// Reference solution for exercise 23.
public class TemperatureWarning {
    public static void main(String[] args) {
        String temperatureInput = JOptionPane.showInputDialog("Hvor mange grader er det ute?");
        double temperature = Double.parseDouble(temperatureInput);

        System.out.println("Det er " + temperature + " grader ute.");

        // No else: when the temperature is above zero there is nothing to add.
        if (temperature < 0) {
            System.out.println("Pass på: det er minusgrader, så det kan være glatt.");
        }
    }
}
