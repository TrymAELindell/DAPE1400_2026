import java.util.HashMap;
import javax.swing.JOptionPane;

// Reference solution for exercise 26 (Del 3).
public class Main {

    public static void main(String[] args) {
        HashMap<String, String> placeByPostalCode = PostalCodeRegister.createPostalCodeMap();

        String postalCode = JOptionPane.showInputDialog("Hvilket postnummer vil du slå opp?");
        JOptionPane.showMessageDialog(null, PostalCodeRegister.describePostalCode(placeByPostalCode, postalCode));
    }
}
