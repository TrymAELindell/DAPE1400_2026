import java.util.ArrayList;

// Reference solution for exercise 22 (Del 2).
//
// Metoden fra oppgaven, gjort kjørbar. Den ber om navn til brukeren skriver
// ett som faktisk står i listen, og fjerner det. remove(element) returnerer
// false så lenge navnet ikke finnes, og det holder do-while-loopen i gang.
public class Main {

    public static void main(String[] args) {
        ArrayList<String> passengerList = PassengerNames.createPassengerList();

        PassengerNames.removeCanceledPassenger(passengerList);

        for (String name : passengerList) {
            System.out.println(name);
        }
    }
}
