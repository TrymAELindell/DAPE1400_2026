import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 48.
//
// Fasit comment (the choice): this solution uses a do-while loop with a
// switch inside it. The program must ask the cashier at least once, and
// a do-while loop always runs at least one round. Another good solution
// is a while loop with one read before the loop. The disadvantage: the
// same prompt line must then be written twice. Inside the loop, the
// program compares one variable (the item name) with five possible
// answers, so a switch fits. An if-else chain also works; the
// disadvantage is that item.equals(...) must be written five times.
// "ferdig" has its own empty case, so it is not counted as an order and
// does not give the "Ukjent vare" message.
public class CoffeeMenu {
    public static void main(String[] args) {
        int orders = 0;
        int totalPrice = 0;
        String item;

        do {
            item = showInputDialog("Skriv inn en bestilling (espresso, cappuccino eller te), eller ferdig:");
            switch (item) {
                case "espresso" -> {
                    orders++;
                    totalPrice += 35;
                }
                case "cappuccino" -> {
                    orders++;
                    totalPrice += 49;
                }
                case "te" -> {
                    orders++;
                    totalPrice += 29;
                }
                case "ferdig" -> {
                    // The sentinel ends the loop; nothing to count.
                }
                default -> showMessageDialog(null, "Ukjent vare: " + item);
            }
        } while (!item.equals("ferdig"));

        showMessageDialog(null, orders + " bestillinger, til sammen " + totalPrice + " kr");
    }
}
