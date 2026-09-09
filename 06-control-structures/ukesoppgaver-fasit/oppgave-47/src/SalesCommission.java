import static javax.swing.JOptionPane.*;

// Reference solution for exercise 47. Migrated from the archive solution;
// identifiers anglicised.
//
// Fasit comment (the choice): this solution uses a while loop, with one
// read before the loop. The loop body then only handles real sales: the
// program reads a price, the loop tests it, and the loop stops before
// the final 0 can be added to the total. Another good solution is a
// do-while loop, because the program must always ask at least once. The
// disadvantage: the final 0 then also goes through the loop body, so you
// need an extra if test to keep 0 out of the total. A for loop does not
// fit here: the number of sales is not known before the loop starts, so
// there is nothing to count.
public class SalesCommission {
    public static void main(String[] args) {
        double totalPrice = 0;

        String priceInput = showInputDialog("Skriv inn prisen på varen, avslutt med 0:");
        double price = Double.parseDouble(priceInput);

        while (price > 0) {
            totalPrice += price;
            priceInput = showInputDialog("Skriv inn prisen på varen, avslutt med 0:");
            price = Double.parseDouble(priceInput);
        }

        double commission = totalPrice * 0.09;
        showMessageDialog(null,
                "Kommisjonen for et salg på totalt " + totalPrice + " kr blir "
                        + commission + " kr");
    }
}
