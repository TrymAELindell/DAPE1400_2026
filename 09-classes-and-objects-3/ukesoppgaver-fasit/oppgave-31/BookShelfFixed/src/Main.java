// Reference solution for exercise 31 (Del 2): print every book on the shelf without crashing.
public class Main {
    public static void main(String[] args) {
        Book[] shelf = new Book[3];
        shelf[0] = new Book("Sofies verden");
        shelf[1] = new Book("Doppler");

        for (int i = 0; i < shelf.length; i++) {
            // shelf[2] er fortsatt null. Sjekken hindrer et metodekall
            // gjennom en null-referanse.
            if (shelf[i] != null) {
                System.out.println(shelf[i].getTitle());
            }
        }
    }
}
