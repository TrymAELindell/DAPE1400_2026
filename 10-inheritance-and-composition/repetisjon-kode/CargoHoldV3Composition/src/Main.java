public class Main {
    public static void main(String[] args) {

        // Her er referanselekkasjen tettet: Baggage har ikke lenger getteren getDimensions.

        Baggage myBaggage = new Baggage(40, 20, 10, 31);
        System.out.println("Bagasjens vekt er: " + myBaggage.getWeight());

        myBaggage.setWeight(120); // avvist — over maksvekten
        System.out.println("Bagasjens vekt er: " + myBaggage.getWeight());

        // Koden som gikk utenom setWeight i CargoHoldV2Composition, kompilerer ikke lenger:
        // Dimensions baggageDimensions = myBaggage.getDimensions();   // KOMPILERINGSFEIL
        // baggageDimensions.setWeight(100);
        // System.out.println("Bagasjens vekt er endret til: " + myBaggage.getWeight());
    }
}
