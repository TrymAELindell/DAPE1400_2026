import javax.swing.JOptionPane;

// Reference solution for exercise 25 — the program the exercise asks about.
// It asks the user for a name and greets them in a message dialog. The method
// call sits on the right-hand side of = because the right-hand side runs
// first: the dialog is shown, and what the user typed is then stored in name.
public class Greeting {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hva heter du?");
        String output = "Hei på deg " + name;
        JOptionPane.showMessageDialog(null, output);
    }
}
