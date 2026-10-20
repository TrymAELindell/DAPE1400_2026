import javax.swing.JOptionPane;

// Reference solution for exercise 3.
public class Main {
    public static void main(String[] args) {
        String radiusInput = JOptionPane.showInputDialog("Hva er radiusen til sirkelen (cm)?");
        double radius;
        try {
            radius = Double.parseDouble(radiusInput);
        } catch (Exception e) {
            radius = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — radiusen er satt til 0");
        }

        double circumference = 2 * 3.14 * radius;

        // String.format("%.2f", value) gives the value with exactly two
        // decimals, as the exercise asks for.
        String circumferenceWithTwoDecimals = String.format("%.2f", circumference);

        JOptionPane.showMessageDialog(null,
                "Omkretsen av en sirkel med " + radius + " cm som radius blir "
                        + circumferenceWithTwoDecimals + " cm.");
    }
}
