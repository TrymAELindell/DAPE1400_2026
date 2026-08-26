import javax.swing.JOptionPane;

// Reference solution for exercise 27: the corrected program. Importing the
// class means the class name has to stay in front of the method call. The
// other fix is to import the method itself with a static import.
public class ImportFormFixed {
    public static void main(String[] args) {
        String answer = JOptionPane.showInputDialog("Hva heter du?");
        System.out.println(answer);
    }
}
