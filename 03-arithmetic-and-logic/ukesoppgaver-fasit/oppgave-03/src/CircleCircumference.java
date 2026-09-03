import javax.swing.JOptionPane;

// Reference solution for exercise 3.
public class CircleCircumference {
    public static void main(String[] args) {
        String radiusInput = JOptionPane.showInputDialog("Hva er radiusen til sirkelen (cm)?");
        double radius = Double.parseDouble(radiusInput);

        double circumference = 2 * 3.14 * radius;

        // String.format("%.2f", value) gives the value with exactly two
        // decimals, as the exercise asks for.
        String circumferenceWithTwoDecimals = String.format("%.2f", circumference);

        JOptionPane.showMessageDialog(null,
                "Omkretsen av en sirkel med " + radius + " cm som radius blir "
                        + circumferenceWithTwoDecimals + " cm.");
    }
}
