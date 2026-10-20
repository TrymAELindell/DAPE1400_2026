// Reference solution for exercise 35 (Del 3): the superclass for letters and parcels.
public class Shipment {
    // Inheritance med overriding passer her. Brev og pakker er begge sendinger,
    // men de regner ut prisen på hver sin måte. Loopen i main kan da kalle
    // computePrice uten å vite hvilken type sending den har.
    // Én klasse med et field for typen og en if-else i computePrice ville også
    // virket. Men da må hver ny type sending inn som en ny gren i den samme metoden.
    // En loop med instanceof og cast for hver type ville også virket. Men da må
    // main kjenne alle typene, og loopen må endres for hver ny type.
    private String kind;

    public Shipment(String kind) {
        this.kind = kind;
    }

    public int computePrice() {
        return 0;
    }

    public String toString() {
        return kind + ": " + computePrice() + " kr";
    }
}
