import javax.swing.JOptionPane;

// Reference solution for exercise 22.
public class NameComparison {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Skriv inn det første navnet");
        String name2 = JOptionPane.showInputDialog("Skriv inn det andre navnet");

        // Strings are compared with equals, never with ==.
        boolean sameName = name1.equals(name2);

        JOptionPane.showMessageDialog(null, "Er navnene like? " + sameName);
    }
}
