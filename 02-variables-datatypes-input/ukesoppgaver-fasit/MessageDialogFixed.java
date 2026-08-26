import javax.swing.JOptionPane;

// Reference solution for exercise 26: the corrected line. showMessageDialog
// needs an extra first parameter, which we set to null; the message is the
// second one. showInputDialog is not built that way - there the prompt is
// the only parameter.
public class MessageDialogFixed {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Klar!");
    }
}
