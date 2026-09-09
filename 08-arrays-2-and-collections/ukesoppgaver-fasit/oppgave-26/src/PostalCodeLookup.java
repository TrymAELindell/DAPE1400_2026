import java.util.HashMap;
import javax.swing.JOptionPane;

// Reference solution for exercise 26 (Del 3).
public class PostalCodeLookup {

    // A HashMap fits here: the job is a lookup from one value to another,
    // which is exactly what key-value pairs are for. The alternative — two
    // parallel lists, indexOf on the codes and get on the places — also
    // works, but it makes the pairing an unwritten rule the code must keep
    // by hand; the map states the pairing outright and looks it up in one
    // call. The postal codes are strings, not numbers — as an int, 0150
    // would lose its leading zero.
    public static HashMap<String, String> createPostalCodeMap() {
        HashMap<String, String> placeByPostalCode = new HashMap<>();
        placeByPostalCode.put("0150", "Oslo");
        placeByPostalCode.put("5003", "Bergen");
        placeByPostalCode.put("7010", "Trondheim");
        placeByPostalCode.put("9008", "Tromsø");
        return placeByPostalCode;
    }

    public static String describePostalCode(HashMap<String, String> placeByPostalCode, String postalCode) {
        if (placeByPostalCode.containsKey(postalCode)) {
            return postalCode + " er i " + placeByPostalCode.get(postalCode);
        } else {
            return "Finner ikke postnummer " + postalCode;
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> placeByPostalCode = createPostalCodeMap();

        String postalCode = JOptionPane.showInputDialog("Hvilket postnummer vil du slå opp?");
        JOptionPane.showMessageDialog(null, describePostalCode(placeByPostalCode, postalCode));
    }
}
