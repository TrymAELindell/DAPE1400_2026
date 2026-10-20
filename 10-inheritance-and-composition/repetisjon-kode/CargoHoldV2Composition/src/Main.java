import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Både Animal og Baggage har nå et Dimensions-field i stedet for fire egne fields.
        // Med composition kan Baggage gjenbruke koden uten å være en subklasse av Animal.

        ArrayList<Animal> animalCargo = new ArrayList<Animal>();
        animalCargo.add(new Cat(20, 10, 10, 5));
        animalCargo.add(new Dog(40, 30, 20, 15));
        animalCargo.add(new Parrot(20, 10, 10, 3));

        ArrayList<Baggage> baggageCargo = new ArrayList<Baggage>();
        baggageCargo.add(new Baggage(110, 20, 30, 30));
        baggageCargo.add(new Baggage(40, 40, 20, 20));

        double totalCargoWeight = 0;
        double totalCargoVolume = 0;

        for (Animal animal : animalCargo) {
            totalCargoWeight += animal.getWeight();
            totalCargoVolume += animal.getVolume();
        }

        for (Baggage baggage : baggageCargo) {
            totalCargoWeight += baggage.getWeight();
            totalCargoVolume += baggage.getVolume();
        }

        System.out.println("Lasterommet inneholder totalt " + totalCargoWeight + " kg");
        System.out.println("og et volum på " + totalCargoVolume + " cm3");

        // Denne versjonen har en referanselekkasje: getDimensions returnerer en referanse til
        // del-objektet. Med den kan vi gå utenom setWeight i Baggage og sette vekten over MAX_WEIGHT.

        Baggage myBaggage = baggageCargo.get(0);
        System.out.println("Bagasjens vekt er: " + myBaggage.getWeight());

        myBaggage.setWeight(120); // avvist — over maksvekten
        System.out.println("Bagasjens vekt er: " + myBaggage.getWeight());

        // Her går vi utenom setWeight i Baggage, via Dimensions-objektet til myBaggage.
        Dimensions baggageDimensions = myBaggage.getDimensions();
        baggageDimensions.setWeight(100);
        System.out.println("Bagasjens vekt er endret til: " + myBaggage.getWeight());

        // Løsningen er å ikke returnere del-objektet fra en getter. Tilby heller metoder som
        // getWeight, eller returner en kopi av objektet.
    }
}
