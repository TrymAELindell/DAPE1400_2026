package apartmentareacalculator;

import apartmentareacalculator.io.SpaceBuilder;
import apartmentareacalculator.spaces.Apartment;

import static javax.swing.JOptionPane.*;

// Reference solution for exercise 37. The classes are organized in packages by
// responsibility: io talks to the user, spaces models the apartment.
public class ApartmentAreaCalculator {
    public static void main(String[] args) {
        Apartment apartment = SpaceBuilder.buildApartment();
        double area = apartment.getTotalArea();
        showMessageDialog(null, "Leiligheten er på " + area + " kvadratmeter");
    }
}
