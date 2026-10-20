// Reference solution for exercise 23 (Del 2): call both greet methods on a PoliteGreeter.
public class Main {
    public static void main(String[] args) {
        Greeter greeter = new PoliteGreeter();
        greeter.greet();
        // PoliteGreeter overskriver ikke greet(String). Derfor kjører den arvede
        // versjonen fra Greeter.
        greeter.greet("Ola");
    }
}
