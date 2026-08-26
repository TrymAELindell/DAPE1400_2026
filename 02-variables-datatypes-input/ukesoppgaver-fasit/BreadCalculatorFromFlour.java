import static javax.swing.JOptionPane.*;

// Reference solution for extra exercise 1.
public class BreadCalculatorFromFlour {
    public static void main(String[] args) {
        String flourInput = showInputDialog("Hvor mye mel har du (dl)?");

        double flourDl;
        try {
            flourDl = Double.parseDouble(flourInput);
        } catch (Exception e) {
            flourDl = 0;
            showMessageDialog(null, "Du skrev ikke inn et tall");
        }

        // The recipe in BreadCalculator uses 2 dl flour to 1 dl milk, so the
        // baker needs half as much milk as flour. The program now knows the
        // ratio, instead of the baker having to know it.
        double milkDl = flourDl / 2.0;
        double doughDl = flourDl + milkDl;
        double doughDlPerLoaf = 2.5;
        double numberOfLoaves = doughDl / doughDlPerLoaf;

        showMessageDialog(null, "Du trenger " + milkDl + " dl melk og kan lage "
                + numberOfLoaves + " brød!");
    }
}
