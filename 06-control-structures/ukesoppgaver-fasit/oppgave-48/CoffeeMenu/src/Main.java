import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 48.
//
// Denne løsningen bruker en do-while-loop med en switch inni. Programmet
// må spørre kassereren minst én gang, og en do-while-loop kjører alltid
// minst én runde. En annen god løsning er en while-loop med én innlesing før
// loopen. Ulempen er at du da må skrive den samme ledeteksten to ganger.
// Inne i loopen sammenlikner programmet én variabel, item, med fem mulige
// svar, så en switch passer. En else if-kjede virker også. Ulempen er at du
// må skrive item.equals(...) fem ganger. "ferdig" har sin egen tomme case,
// så programmet teller det ikke som en bestilling og gir ikke meldingen
// "Ukjent vare".
public class Main {
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
