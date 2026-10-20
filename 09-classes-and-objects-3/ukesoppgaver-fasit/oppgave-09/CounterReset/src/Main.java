// Reference solution for exercise 9: compare tryToReset and resetCounter.
public class Main {
    public static void main(String[] args) {
        int localNumber = 42;
        CounterUtils.tryToReset(localNumber);
        System.out.println("Etter tryToReset: " + localNumber);

        ClickCounter counter = new ClickCounter();
        counter.click();
        counter.click();
        counter.click();
        CounterUtils.resetCounter(counter);
        System.out.println("Etter resetCounter: " + counter.getClicks());
    }
}
