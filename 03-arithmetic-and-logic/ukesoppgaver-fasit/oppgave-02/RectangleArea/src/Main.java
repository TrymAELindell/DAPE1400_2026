import javax.swing.JOptionPane;

// Reference solution for exercise 2.
public class Main {
    public static void main(String[] args) {
        String widthInput = JOptionPane.showInputDialog("Hvor bredt er rektangelet (cm)?");
        String lengthInput = JOptionPane.showInputDialog("Hvor langt er rektangelet (cm)?");

        double width;
        double length;
        try {
            width = Double.parseDouble(widthInput);
            length = Double.parseDouble(lengthInput);
        } catch (Exception e) {
            width = 0;
            length = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn tall — bredden og lengden er satt til 0");
        }

        double area = width * length;

        JOptionPane.showMessageDialog(null,
                "Et rektangel med bredde " + width + " cm og lengde " + length
                        + " cm har et areal på " + area + " cm^2");
    }
}
