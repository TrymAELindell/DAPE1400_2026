import java.util.ArrayList;
import javax.swing.JOptionPane;

// Reference solution for exercise 5: check a name against the boarding list with contains, report
// the queue position with indexOf, and remove the name with
// remove(element).
public class BoardingCheck {

    public static String describePosition(ArrayList<String> boardingList, String name) {
        if (boardingList.contains(name)) {
            int index = boardingList.indexOf(name);
            return name + " er nummer " + (index + 1) + " i køen";
        }
        return name + " står ikke på lista";
    }

    public static void main(String[] args) {
        ArrayList<String> boardingList = PassengerInsertReplace.createBoardingList();

        String name = JOptionPane.showInputDialog("Hvilket navn vil du sjekke?");

        JOptionPane.showMessageDialog(null, describePosition(boardingList, name));
        if (boardingList.contains(name)) {
            boardingList.remove(name);
            JOptionPane.showMessageDialog(null,
                    boardingList.size() + " passasjerer igjen på lista");
        }
    }
}
