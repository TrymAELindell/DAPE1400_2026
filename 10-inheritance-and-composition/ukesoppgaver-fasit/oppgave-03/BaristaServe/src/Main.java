// Reference solution for exercise 3: print the barista and call serve.
public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista("Mons", 195);
        System.out.println(barista);
        barista.serve("cortado");
    }
}
