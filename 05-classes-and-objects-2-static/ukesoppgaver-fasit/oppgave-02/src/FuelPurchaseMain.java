// Reference solution for exercise 2.
public class FuelPurchaseMain {
    public static void main(String[] args) {
        FuelPurchase purchase = new FuelPurchase("Oslo", "Diesel", 42.3, 21.49, "2026-08-19 14:32");

        double totalPrice = purchase.calculateTotalPrice();
        System.out.println("Kjøp hos stasjonen i " + purchase.getStationLocation());
        System.out.println("Drivstoff: " + purchase.getFuelType());
        System.out.println("Totalpris: " + String.format("%.2f", totalPrice) + " kr");
    }
}
