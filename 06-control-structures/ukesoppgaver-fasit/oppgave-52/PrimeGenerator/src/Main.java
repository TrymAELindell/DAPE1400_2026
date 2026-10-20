import static javax.swing.JOptionPane.*;

// Reference solution for exercise 52. The inner while loop stops as soon as
// a divisor is found, expressed in the loop condition itself.
//
// Denne løsningen bruker en for-loop ytterst og en while-loop inni.
// Kandidatene 2..upperLimit er et kjent antall, så en for-loop passer der.
// Søket etter en divisor er annerledes. Det skal stoppe så snart en divisor
// er funnet, og while-betingelsen kan si det. Nested for-looper virker også.
// Ulempen er det samme problemet med tidlig stopp som i oppgave 51. Uten
// break (modul 07) må divisorFound-testen inn i betingelsen i for-loopen i
// stedet.
public class Main {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv ut alle primtall opp til:");
        int upperLimit;
        try {
            upperLimit = Integer.parseInt(input);
        } catch (Exception e) {
            upperLimit = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — grensen er satt til 0");
        }

        String output = "";
        for (int candidate = 2; candidate <= upperLimit; candidate++) {
            boolean divisorFound = false;
            int divisor = 2;
            while (divisor < candidate && !divisorFound) {
                if (candidate % divisor == 0) {
                    divisorFound = true;
                }
                divisor++;
            }
            if (!divisorFound) {
                output += candidate + " ";
            }
        }

        showMessageDialog(null, "Primtall opp til " + upperLimit + ":\n" + output);
    }
}
