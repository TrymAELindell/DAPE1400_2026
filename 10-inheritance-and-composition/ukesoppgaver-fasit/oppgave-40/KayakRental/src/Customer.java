// Reference solution for exercise 40 (Del 3): a customer who rents a kayak and returns it.
public class Customer {
    // Aggregation passer her. Kajakken finnes før og etter hver utleie, og den vet selv
    // om den er utleid og hvor mange ganger. Derfor går det samme Kayak-objektet fra
    // Kari til Ola.
    // Et String-field med kajakknavnet i hver kunde ville også virket. Men da må main
    // holde styr på både telleren og om kajakken er ledig.
    // Composition, der hver kunde lager sin egen Kayak, ville gitt to kajakker som
    // hver er leid ut én gang.
    private String name;
    private Kayak kayak;

    public Customer(String name) {
        this.name = name;
    }

    public void rent(Kayak kayak) {
        if (kayak.rentOut()) {
            this.kayak = kayak;
            System.out.println(name + " leier " + kayak.getName());
        } else {
            System.out.println(name + " kan ikke leie " + kayak.getName() + ", den er utleid");
        }
    }

    public void returnKayak() {
        if (kayak != null) {
            kayak.registerReturn();
            System.out.println(name + " leverer " + kayak.getName());
            this.kayak = null;
        }
    }
}
