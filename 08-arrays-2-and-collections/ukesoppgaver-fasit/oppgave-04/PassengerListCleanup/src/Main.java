import java.util.ArrayList;

// Reference solution for exercise 4: remove by value and by index, check with
// contains, insert with add(index, element), replace with set, then empty
// the list with clear.
//
// Programmet bygger videre på oppgave 3.
public class Main {

    public static void main(String[] args) {
        ArrayList<String> boardingList = BoardingList.createBoardingList();

        boardingList.remove("Ellen Gleditsch");
        System.out.println("Ellen Gleditsch på lista: "
                + boardingList.contains("Ellen Gleditsch"));

        boardingList.remove(0);
        boardingList.add(1, "Nora Berg");
        boardingList.set(0, "Grete Berg");
        BoardingList.printList(boardingList);

        boardingList.clear();
        System.out.println("Antall som venter: " + boardingList.size());
    }
}
