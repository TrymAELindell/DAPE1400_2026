// Reference solution for exercise 37 (Del 3): load a shelf and a van.
public class Main {
    public static void main(String[] args) {
        Shelf shelf = new Shelf("Hylle A", 200);
        Van van = new Van("Varebil 1", 1000);
        shelf.load(120);
        shelf.load(100);
        van.load(800);
        van.load(150);
    }
}
