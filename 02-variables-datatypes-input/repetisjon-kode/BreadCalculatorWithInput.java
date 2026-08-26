import static javax.swing.JOptionPane.*;

public class BreadCalculatorWithInput {
    public static void main(String[] args) {
        // This program is an upgraded version of BreadCalculator.
        // Most bakers cannot program, so it would be nice if the program
        // asked the baker how much flour and milk they have, instead of
        // them having to edit the code.

        // For this we use the Java package swing — ready-written code for
        // building graphical user interfaces. We import what we need on
        // line 1 of this file; specifically we use showInputDialog and
        // showMessageDialog, which both belong to JOptionPane.

        // As in BreadCalculator we need double variables to store the
        // amount of each ingredient as decimal numbers:
        double flourDl, milkDl;

        // Input from showInputDialog always arrives as a String. A String
        // cannot be put directly into a double variable, so we store the
        // user input in String variables first and convert afterwards.

        // showInputDialog is a method. Methods are a topic for later, but
        // it is useful to know that methods can take input themselves:
        // the String we pass in is shown to the user as the prompt, so we
        // can ask specifically for each ingredient.
        String flourInput = showInputDialog("Hvor mye mel har du (dl)?");
        String milkInput = showInputDialog("Hvor mye melk har du (dl)?");

        // A String value can be converted to double with
        // Double.parseDouble(stringVariable), so we could just write
        // flourDl = Double.parseDouble(flourInput);
        // But that only works if the value can be interpreted as a decimal
        // number. If the String is "tre" or "2 dl" we get an Exception and
        // the program crashes.

        // To avoid that we use try { } catch (Exception e) { }:
        // try runs the code inside its { }. If that fails, an Exception is
        // thrown, and catch catches it and runs the backup code instead.
        try {
            // Here we try to convert the user input to double:
            flourDl = Double.parseDouble(flourInput);
            milkDl = Double.parseDouble(milkInput);
        } catch (Exception e) {
            // If the input cannot be converted, we cannot calculate how
            // many loaves the baker can make. Setting both amounts to 0
            // makes the calculation come out as 0 loaves, which is a
            // reasonable answer when we do not know the amounts.
            flourDl = 0;
            milkDl = 0;
            // It is also polite to tell the user what went wrong:
            showMessageDialog(null, "Du skrev ikke inn et tall");
            // Note that showMessageDialog needs a first parameter, here
            // written as null. What null means is a topic for later.
        }

        // Here we calculate how many loaves the baker can make:
        double doughDl = flourDl + milkDl;
        double doughDlPerLoaf = 2.5;
        double numberOfLoaves = doughDl / doughDlPerLoaf;

        // And finally we show the result in a pop-up window:
        showMessageDialog(null, "Du kan lage " + numberOfLoaves + " brød!");
    }
}
