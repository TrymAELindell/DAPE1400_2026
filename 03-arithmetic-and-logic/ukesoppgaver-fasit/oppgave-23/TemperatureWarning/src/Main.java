import javax.swing.JOptionPane;

// Reference solution for exercise 23.
public class Main {
    public static void main(String[] args) {
        String temperatureInput = JOptionPane.showInputDialog("Hvor mange grader er det ute?");
        double temperature;
        try {
            temperature = Double.parseDouble(temperatureInput);
        } catch (Exception e) {
            temperature = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — temperaturen er satt til 0 grader");
        }

        System.out.println("Det er " + temperature + " grader ute.");

        // No else: when the temperature is above zero there is nothing to add.
        if (temperature < 0) {
            System.out.println("Pass på: det er minusgrader, så det kan være glatt.");
        }
    }
}
