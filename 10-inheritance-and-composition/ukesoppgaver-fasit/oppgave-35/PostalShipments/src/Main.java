import java.util.ArrayList;

// Reference solution for exercise 35 (Del 3): four shipments and the total.
public class Main {
    public static void main(String[] args) {
        ArrayList<Shipment> shipments = new ArrayList<>();
        shipments.add(new Letter());
        shipments.add(new Parcel(3));
        shipments.add(new Parcel(12));
        shipments.add(new Letter());

        int total = 0;
        for (Shipment shipment : shipments) {
            System.out.println(shipment);
            total += shipment.computePrice();
        }
        System.out.println("Til sammen: " + total + " kr");
    }
}
