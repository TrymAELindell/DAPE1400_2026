import javax.swing.JOptionPane;

// Reference solution for exercise 52.
public class Main {
    public static void main(String[] args) {
        // Assumption: the description says nothing about how the group is
        // counted, so the program asks for the total number of people and how
        // many of them are children.
        String groupInput = JOptionPane.showInputDialog("Hvor mange er det i gruppa?");
        String childrenInput = JOptionPane.showInputDialog("Hvor mange av dem er barn?");

        int groupSize;
        try {
            groupSize = Integer.parseInt(groupInput);
        } catch (Exception e) {
            groupSize = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall personer i gruppa er satt til 0");
        }

        int childCount;
        try {
            childCount = Integer.parseInt(childrenInput);
        } catch (Exception e) {
            childCount = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — antall barn er satt til 0");
        }

        int capacity = 40;

        int fullTrips = groupSize / capacity;
        int passengersOnLastTrip = groupSize % capacity;

        int trips = fullTrips;
        if (passengersOnLastTrip > 0) {
            trips = fullTrips + 1;
        }

        JOptionPane.showMessageDialog(null, "Gruppa på " + groupSize
                + " personer, hvorav " + childCount + " barn, trenger " + trips + " turer.");

        // Assumption: "noen få igjen" is read as less than half a full load.
        if (passengersOnLastTrip > 0 && passengersOnLastTrip < capacity / 2) {
            JOptionPane.showMessageDialog(null, "Siste tur har bare " + passengersOnLastTrip
                    + " passasjerer — vurder å vente på neste buss.");
        }

        // Assumption: half price for a child means half of the adult ticket.
        double adultPrice = 85.0;
        double childPrice = adultPrice / 2;
        int adultCount = groupSize - childCount;

        double total = adultCount * adultPrice + childCount * childPrice;

        JOptionPane.showMessageDialog(null, "Til sammen skal gruppa betale " + total + " kr.");
    }
}
