// Reference solution for exercise 40 (Del 3): one kayak, two customers, two rentals.
public class Main {
    public static void main(String[] args) {
        Kayak kayak = new Kayak("Kajakk 3");
        Customer kari = new Customer("Kari");
        Customer ola = new Customer("Ola");

        kari.rent(kayak);
        ola.rent(kayak);
        kari.returnKayak();
        ola.rent(kayak);
        System.out.println(kayak.getName() + " er leid ut " + kayak.getRentalCount() + " ganger");
    }
}
