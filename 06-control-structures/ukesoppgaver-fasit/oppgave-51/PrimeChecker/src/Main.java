import static javax.swing.JOptionPane.*;

// Reference solution for exercise 51.
//
// Denne løsningen bruker en while-loop, fordi betingelsen i loopen kan
// nevne begge grunnene til å stoppe. Enten er det ingen flere divisorer å
// teste, eller så er en divisor funnet. En annen god løsning er en for-loop
// over divisorene. Ulempen er at loopen må stoppe tidlig. Denne uka kan
// loopen ikke bruke break, fordi break i looper kommer i modul 07. Uten
// break har en for-loop to valg. Den kan fortsette til slutten etter at en
// divisor er funnet, eller den kan legge den samme divisorFound-testen inn
// i betingelsen i for-loopen. While-loopen viser den testen direkte.
public class Main {
    public static void main(String[] args) {
        String input = showInputDialog("Hvilket tall skal sjekkes?");
        int number;
        try {
            number = Integer.parseInt(input);
        } catch (Exception e) {
            number = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — tallet er satt til 0");
        }

        boolean divisorFound = false;
        int divisor = 2;
        while (divisor < number && !divisorFound) {
            if (number % divisor == 0) {
                divisorFound = true;
            }
            divisor++;
        }

        if (number >= 2 && !divisorFound) {
            showMessageDialog(null, number + " er et primtall");
        } else {
            showMessageDialog(null, number + " er ikke et primtall");
        }
    }
}
