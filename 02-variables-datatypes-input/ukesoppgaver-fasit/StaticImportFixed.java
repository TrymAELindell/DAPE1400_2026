import static javax.swing.JOptionPane.showInputDialog;
// The original imported showInputDialog only, so showMessageDialog was still
// unknown. Importing it as well is one fix; the other is a * import, which
// brings in every method of the class at once.
import static javax.swing.JOptionPane.showMessageDialog;

// Reference solution for exercise 28: the corrected program.
public class StaticImportFixed {
    public static void main(String[] args) {
        String answer = showInputDialog("Hva heter du?");
        showMessageDialog(null, "Hei " + answer);
    }
}
