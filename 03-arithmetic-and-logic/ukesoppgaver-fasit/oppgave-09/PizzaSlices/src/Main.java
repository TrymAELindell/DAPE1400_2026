import javax.swing.JOptionPane;

// Reference solution for exercise 9.
public class Main {
    public static void main(String[] args) {
        String pizzaCountInput = JOptionPane.showInputDialog("Hvor mange pizzaer?");
        String personCountInput = JOptionPane.showInputDialog("Hvor mange personer?");
        String slicesPerPizzaInput = JOptionPane.showInputDialog("Hvor mange slices per pizza?");

        int pizzaCount;
        try {
            pizzaCount = Integer.parseInt(pizzaCountInput);
        } catch (Exception e) {
            pizzaCount = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall pizzaer er satt til 0");
        }

        int personCount;
        try {
            personCount = Integer.parseInt(personCountInput);
        } catch (Exception e) {
            // Backup value 1, not 0: the program divides by this number.
            personCount = 1;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall personer er satt til 1");
        }

        int slicesPerPizza;
        try {
            slicesPerPizza = Integer.parseInt(slicesPerPizzaInput);
        } catch (Exception e) {
            slicesPerPizza = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall slices per pizza er satt til 0");
        }

        int totalSlices = pizzaCount * slicesPerPizza;

        // Integer division gives the whole slices per person; modulus
        // gives the slices left over when everyone has had their share.
        int slicesPerPerson = totalSlices / personCount;
        int leftoverSlices = totalSlices % personCount;

        JOptionPane.showMessageDialog(null,
                "Dersom man er " + personCount + " personer og har " + pizzaCount
                        + " pizzaer med " + slicesPerPizza + " slices hver, får hver person "
                        + slicesPerPerson + " slices og " + leftoverSlices + " blir til overs.");
    }
}
