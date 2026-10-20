import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Aggregation: en klasse har et field av en annen klassetype, men del-objektet
        // finnes uavhengig av objektet som har det.

        // Passasjeren har kjæledyret sitt som et field. Dyret skal også ligge i lasterommet,
        // så vi trenger en referanse til det utenfor Passenger-objektet.

        ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
        ArrayList<Animal> animalCargoHold = new ArrayList<Animal>();

        passengerList.add(new Passenger("Rawan"));
        passengerList.add(new Passenger("Heidi"));
        passengerList.add(new Passenger("Ola"));

        Animal pet = new Cat(20, 15, 10, 5);   // dyret finnes uavhengig

        passengerList.get(2).setPet(pet);      // passasjeren har dyret ...
        animalCargoHold.add(pet);              // ... og lasterommet har det også
    }
}
