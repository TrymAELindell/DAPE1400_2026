public class Main {
    public static void main(String[] args) {
        // Person har to konstruktører. Denne tar alderen og fødselsmåneden som argumenter.
        Person trym = new Person(
                34,
                "Januar"
        );

        // Denne konstruktøren har ingen parametre. Den spør brukeren i to inputbokser i stedet.
        Person student = new Person();

        // Uten argument øker incrementAge alderen med 1.
        trym.incrementAge();

        // Med et argument øker incrementAge alderen med verdien til argumentet.
        trym.incrementAge(4);

        // Du har brukt overloading før: add i ArrayList (modul 08) finnes både med og uten indeks.
    }
}
