import java.util.ArrayList;

// Reference solution for exercise 8: build the unsorted passenger list and print it.
public class PassengerNames {

    public static ArrayList<String> createPassengerList() {
        ArrayList<String> passengerList = new ArrayList<>();
        passengerList.add("Gudrun Wolan");
        passengerList.add("Ellen Gleditsch");
        passengerList.add("Andrea Arntsen");
        passengerList.add("Grete Kittelsen");
        return passengerList;
    }

    public static void printList(ArrayList<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }
}
