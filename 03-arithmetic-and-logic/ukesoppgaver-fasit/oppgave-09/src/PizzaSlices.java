import javax.swing.JOptionPane;

// Reference solution for exercise 9.
public class PizzaSlices {
    public static void main(String[] args) {
        String pizzaCountInput = JOptionPane.showInputDialog("Hvor mange pizzaer?");
        String personCountInput = JOptionPane.showInputDialog("Hvor mange personer?");
        String slicesPerPizzaInput = JOptionPane.showInputDialog("Hvor mange slices per pizza?");

        int pizzaCount = Integer.parseInt(pizzaCountInput);
        int personCount = Integer.parseInt(personCountInput);
        int slicesPerPizza = Integer.parseInt(slicesPerPizzaInput);

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
