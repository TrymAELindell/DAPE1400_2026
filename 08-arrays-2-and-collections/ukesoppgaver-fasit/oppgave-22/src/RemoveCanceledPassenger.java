import java.util.ArrayList;
import javax.swing.JOptionPane;

// Reference solution for exercise 22 (Del 2): the method from the handout, runnable. It asks for
// names until the user enters one that is actually in the list, and
// removes it — remove(element) returns false as long as the name is not
// found, which keeps the do-while loop asking.
public class RemoveCanceledPassenger {

    public static void removeCanceledPassenger(ArrayList<String> passengerList) {
        String name;
        do {
            name = JOptionPane.showInputDialog("Hvilken passasjer har kansellert?");
        } while (passengerList.remove(name) == false);
    }

    public static void main(String[] args) {
        ArrayList<String> passengerList = SortNames.createPassengerList();

        removeCanceledPassenger(passengerList);

        for (String name : passengerList) {
            System.out.println(name);
        }
    }
}
