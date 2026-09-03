import javax.swing.JOptionPane;

// Reference solution for exercise 2.
public class RectangleArea {
    public static void main(String[] args) {
        String widthInput = JOptionPane.showInputDialog("Hvor bredt er rektangelet (cm)?");
        String lengthInput = JOptionPane.showInputDialog("Hvor langt er rektangelet (cm)?");

        double width = Double.parseDouble(widthInput);
        double length = Double.parseDouble(lengthInput);

        double area = width * length;

        JOptionPane.showMessageDialog(null,
                "Et rektangel med bredde " + width + " cm og lengde " + length
                        + " cm har et areal på " + area + " cm^2");
    }
}
