// Reference solution for exercise 43 (Del 3).
public class Main {
    public static void main(String[] args) {
        // En klasse Book med toString passer her. Hver bok har tre deler som hører
        // sammen, og toString gir den samme beskrivelsen både i lista og i
        // anbefalingen.
        // Tre arrayer, én for titler, én for forfattere og én for sidetall, ville
        // også virket. Men da ligger hver bok spredt over tre arrayer, og
        // indeksene må holdes like for hånd.
        // En egen metode som describe() ville også virket, men den må kalles for
        // hånd hver gang, også i konkateneringen.
        Book[] books = {
            new Book("Sofies verden", "Jostein Gaarder", 512),
            new Book("Doppler", "Erlend Loe", 170),
            new Book("Naiv. Super.", "Erlend Loe", 200)
        };

        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("Ukas anbefaling: " + books[1]);
    }
}
