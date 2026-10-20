// Reference solution for exercise 28 (Del 2): two boats take trips.
public class Main {
    public static void main(String[] args) {
        Boat seagull = new Boat("Måken");
        Boat tern = new Boat("Terna");
        seagull.takeTrip(3);
        seagull.takeTrip(2);
        tern.takeTrip(4);
        System.out.println(seagull);
        System.out.println(tern);
    }
}
