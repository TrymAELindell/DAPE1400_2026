import javax.swing.JOptionPane;

// Reference solution for exercise 19.
public class Main {
    public static void main(String[] args) {
        String doughInput = JOptionPane.showInputDialog("Hvor mange dl deig har du?");
        double doughDl;
        try {
            doughDl = Double.parseDouble(doughInput);
        } catch (Exception e) {
            doughDl = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall — deigmengden er satt til 0 dl");
        }

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
