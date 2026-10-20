import java.util.ArrayList;
import javax.swing.JOptionPane;

// Reference solution for exercise 22: the methods that build and change the
// passenger list.
public class PassengerNames {

    public static ArrayList<String> createPassengerList() {
        ArrayList<String> passengerList = new ArrayList<>();
        passengerList.add("Gudrun Wolan");
        passengerList.add("Ellen Gleditsch");
        passengerList.add("Andrea Arntsen");
        passengerList.add("Grete Kittelsen");
        return passengerList;
    }

    public static void removeCanceledPassenger(ArrayList<String> passengerList) {
        String name;
        do {
            name = JOptionPane.showInputDialog("Hvilken passasjer har kansellert?");
        } while (passengerList.remove(name) == false);
    }
}
