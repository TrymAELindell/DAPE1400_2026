package apartmentareacalculator.io;

import apartmentareacalculator.spaces.*;

import static javax.swing.JOptionPane.*;

// Reference solution for exercise 37.
public class SpaceBuilder {

    // A method in one class building objects of another class
    public static Apartment buildApartment() {
        Apartment apartment = new Apartment(
                buildRoom("entré"),
                buildRoom("kjøkken"),
                buildRoom("stue"),
                buildRoom("soverom"),
                buildRoom("bad")
        );
        return apartment;
    }

    public static Room buildRoom(String roomName) {
        Room room = new Room(
                requestMeasure(roomName + " lengde: "),
                requestMeasure(roomName + " bredde: ")
        );
        return room;
    }

    public static double requestMeasure(String requestMessage) {
        String inputMeasure = showInputDialog(requestMessage);
        double measure;
        try {
            measure = Double.parseDouble(inputMeasure);
        } catch (Exception e) {
            measure = 0;
            System.out.println("Input må være et tall");
        }
        return measure;
    }
}
