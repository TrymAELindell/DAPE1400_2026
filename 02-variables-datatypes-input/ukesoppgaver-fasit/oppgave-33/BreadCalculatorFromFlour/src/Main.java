import static javax.swing.JOptionPane.*;

// Reference solution for exercise 33.
public class Main {
    public static void main(String[] args) {
        String flourInput = showInputDialog("Hvor mye mel har du (dl)?");

        // double is the right type for every amount here. The flour, the
        // milk and numberOfLoaves all come out as fractions in a normal
        // batch. int would compile and run, and that is what makes it the
        // dangerous choice. It would report 7.5 loaves as 7. The baker
        // would never learn that half a loaf went missing.
        double flourDl;
        try {
            flourDl = Double.parseDouble(flourInput);
        } catch (Exception e) {
            flourDl = 0;
            showMessageDialog(null, "Du skrev ikke inn et tall");
        }

        // The recipe is 2 dl flour to 1 dl milk, so the baker needs half as
        // much milk as flour. The program knows the ratio now, instead of the
        // baker having to know it.
        double milkDl = flourDl / 2.0;
        double doughDl = flourDl + milkDl;
        double doughDlPerLoaf = 2.5;
        double numberOfLoaves = doughDl / doughDlPerLoaf;

        showMessageDialog(null, "Du trenger " + milkDl + " dl melk og kan lage "
                + numberOfLoaves + " brød!");
    }
}
