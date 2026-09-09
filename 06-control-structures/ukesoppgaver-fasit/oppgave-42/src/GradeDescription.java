import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 42.
//
// Fasit comment (the choice): this solution uses a switch. All six
// branches compare the same variable with a fixed value, and that is
// exactly the job switch is made for. The table from letter to text is
// easy to read in the cases. Another good solution is an if-else chain.
// The disadvantage: you must write grade.equals(...) six times, and the
// important content — which letter means what — becomes harder to see.
public class GradeDescription {
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
