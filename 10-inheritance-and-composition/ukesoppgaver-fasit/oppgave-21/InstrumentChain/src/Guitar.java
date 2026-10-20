// Reference solution for exercise 21 (Del 2): the subclass.
public class Guitar extends Instrument {
    public Guitar() {
        // Java setter inn super() som første setning her. Derfor kjører
        // konstruktøren til Instrument før denne linjen.
        System.out.println("Gitar stemt");
    }
}
