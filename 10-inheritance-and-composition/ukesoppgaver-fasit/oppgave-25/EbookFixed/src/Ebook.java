// Reference solution for exercise 25 (Del 2): the fixed subclass.
public class Ebook extends Book {
    private double fileSizeMb;

    public Ebook(String title, double fileSizeMb) {
        // Kallet på super(title) manglet. Book har ingen konstruktør uten
        // parametre, så Java kan ikke sette inn super() selv.
        super(title);
        this.fileSizeMb = fileSizeMb;
    }
}
