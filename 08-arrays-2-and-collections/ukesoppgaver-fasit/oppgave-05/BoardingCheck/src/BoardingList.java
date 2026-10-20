import java.util.ArrayList;

// Reference solution for exercise 5: build the boarding list and describe where a name is in the
// queue.
public class BoardingList {

    public static ArrayList<String> createBoardingList() {
        ArrayList<String> boardingList = new ArrayList<>();
        boardingList.add("Andrea Arntsen");
        boardingList.add("Ellen Gleditsch");
        boardingList.add("Gudrun Wolan");

        boardingList.add(1, "Grete Kittelsen");
        boardingList.set(0, "Andrea Aulie");
        return boardingList;
    }

    public static String describePosition(ArrayList<String> boardingList, String name) {
        if (boardingList.contains(name)) {
            int index = boardingList.indexOf(name);
            return name + " er nummer " + (index + 1) + " i køen";
        }
        return name + " står ikke på lista";
    }
}
