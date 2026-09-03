import javax.swing.JOptionPane;

// Reference solution for exercise 19.
public class BreadCountWithLeftovers {
    public static void main(String[] args) {
        String doughInput = JOptionPane.showInputDialog("Hvor mange dl deig har du?");
        double doughDl = Double.parseDouble(doughInput);

        double doughPerBread = 2.5;

        // The parentheses matter: the division runs first, and the result is
        // narrowed to whole loaves afterwards.
        int breadCount = (int) (doughDl / doughPerBread);

        // Modulus works on decimal numbers too, and gives the dough left over.
        double leftoverDough = doughDl % doughPerBread;

        JOptionPane.showMessageDialog(null, "Du kan bake " + breadCount
                + " brød, og " + leftoverDough + " dl deig blir til overs.");
    }
}
