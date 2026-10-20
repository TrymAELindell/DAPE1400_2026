import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 42.
//
// Denne løsningen bruker en switch. Alle de seks greinene sammenlikner den
// samme variabelen med en fast verdi, og det er akkurat den jobben switch er
// laget for. Hvilken bokstav som gir hvilken tekst, er lett å lese i casene.
// En annen god løsning er en else if-kjede. Ulempen er at du må skrive
// grade.equals(...) seks ganger. Det viktige innholdet, hvilken bokstav som
// betyr hva, blir også vanskeligere å se.
public class Main {
    public static void main(String[] args) {
        String grade = showInputDialog("Skriv inn en bokstavkarakter (A-F):");

        String description = switch (grade) {
            case "A" -> "fremragende";
            case "B" -> "meget god";
            case "C" -> "god";
            case "D" -> "nokså god";
            case "E" -> "tilstrekkelig";
            case "F" -> "ikke bestått";
            default -> "";
        };

        if (description.equals("")) {
            showMessageDialog(null, "Ukjent karakter: " + grade);
        } else {
            showMessageDialog(null, "Karakteren " + grade + " betyr: " + description);
        }
    }
}
