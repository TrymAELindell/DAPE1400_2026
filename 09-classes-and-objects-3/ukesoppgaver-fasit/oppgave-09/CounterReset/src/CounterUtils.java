// Reference solution for exercise 9: an object as parameter and a primitive as parameter.
public class CounterUtils {

    // Parameteren får en kopi av referansen. Metoden jobber derfor på det
    // samme objektet som main har.
    public static void resetCounter(ClickCounter counter) {
        counter.reset();
    }

    // Parameteren får en kopi av tallet. Å sette den til 0 endrer bare kopien.
    public static void tryToReset(int number) {
        number = 0;
        System.out.println("Inne i metoden: " + number);
    }
}
