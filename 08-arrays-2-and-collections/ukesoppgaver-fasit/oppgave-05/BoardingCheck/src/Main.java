import java.util.ArrayList;
import javax.swing.JOptionPane;

// Reference solution for exercise 5: check a name against the boarding list with contains, report
// the queue position with indexOf, and remove the name with
// remove(element).
public class Main {

    public static void main(String[] args) {
        ArrayList<String> boardingList = BoardingList.createBoardingList();

        String name = JOptionPane.showInputDialog("Hvilket navn vil du sjekke?");

        JOptionPane.showMessageDialog(null, BoardingList.describePosition(boardingList, name));
        if (boardingList.contains(name)) {
            boardingList.remove(name);
            JOptionPane.showMessageDialog(null,
                    boardingList.size() + " passasjerer igjen på lista");
        }
    }
}
