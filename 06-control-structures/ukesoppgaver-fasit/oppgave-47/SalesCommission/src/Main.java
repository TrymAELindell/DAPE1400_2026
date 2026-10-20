import static javax.swing.JOptionPane.*;

// Reference solution for exercise 47. Migrated from the archive solution;
// identifiers anglicised.
//
// Denne løsningen bruker en while-loop, med én innlesing før loopen.
// Loopens blokk håndterer da bare ekte salg. Programmet leser en pris,
// loopen tester den, og loopen stopper før den avsluttende 0 kan legges til
// summen. En annen god løsning er en do-while-loop, fordi programmet alltid
// må spørre minst én gang. Ulempen er at den avsluttende 0 da også går
// gjennom loopens blokk. Du trenger en ekstra if-test for å holde 0 utenfor
// summen. En for-loop passer ikke her. Antallet salg er ikke kjent før
// loopen starter, så det er ingenting å telle.
public class Main {
    public static void main(String[] args) {
        double totalPrice = 0;

        String priceInput = showInputDialog("Skriv inn prisen på varen, avslutt med 0:");
        double price;
        try {
            price = Double.parseDouble(priceInput);
        } catch (Exception e) {
            price = 0;
            showMessageDialog(null, "Du skrev ikke inn et tall — prisen er satt til 0, og innlesingen stopper");
        }

        while (price > 0) {
            totalPrice += price;
            priceInput = showInputDialog("Skriv inn prisen på varen, avslutt med 0:");
            try {
                price = Double.parseDouble(priceInput);
            } catch (Exception e) {
                price = 0;
                showMessageDialog(null, "Du skrev ikke inn et tall — prisen er satt til 0, og innlesingen stopper");
            }
        }

        double commission = totalPrice * 0.09;
        showMessageDialog(null,
                "Kommisjonen for et salg på totalt " + totalPrice + " kr blir "
                        + commission + " kr");
    }
}
