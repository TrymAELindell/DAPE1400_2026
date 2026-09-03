import static javax.swing.JOptionPane.*;

public class BreadCalculatorWithLeftovers {
    public static void main(String[] args) {
        // This program extends the bread calculator from module 02.
        // Instead of asking for both flour and milk, it asks only for the
        // flour and calculates how much milk the recipe needs. It then
        // tells the baker how many whole loaves they can bake, and how
        // much dough is left over.

        // As in module 02: read the input as a String and convert it to
        // double inside try/catch, so the program survives input that is
        // not a number.
        double flourDl;
        String flourDlInput = showInputDialog("Hvor mye mel har du?");
        try {
            flourDl = Double.parseDouble(flourDlInput);
        } catch (Exception e) {
            flourDl = 0;
        }

        // The recipe uses half as much milk as flour, so the required
        // amount of milk is a simple multiplication:
        double flourToMilkRatio = 0.5;
        double requiredMilkDl = flourDl * flourToMilkRatio;
        showMessageDialog(
                null,
                "Du trenger " + requiredMilkDl + " dl melk");

        // The total amount of dough is flour plus milk:
        double doughDl = flourDl + requiredMilkDl;

        // Each loaf takes 2.5 dl of dough — the same recipe as the
        // calculators in module 02.
        double doughPerBread = 2.5;

        // You cannot bake half a loaf, so the number of loaves must be a
        // whole number. Casting the result of the division to int cuts
        // away the decimals and keeps only the whole loaves:
        int nrOfBread = (int) (doughDl / doughPerBread);

        // The modulus operator % gives the rest of the division — the
        // dough that was not enough for another whole loaf:
        double leftoverDough = doughDl % doughPerBread;

        String out = "Du kan lage " + nrOfBread + " brød, og vil ha " + leftoverDough + " dl deig til overs";
        showMessageDialog(null, out);
    }
}
