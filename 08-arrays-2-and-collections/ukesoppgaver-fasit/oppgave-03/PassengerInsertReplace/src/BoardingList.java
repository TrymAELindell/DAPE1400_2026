import java.util.ArrayList;

// Reference solution for exercise 3: build the boarding list and print it.
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

    public static void printList(ArrayList<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }
}
