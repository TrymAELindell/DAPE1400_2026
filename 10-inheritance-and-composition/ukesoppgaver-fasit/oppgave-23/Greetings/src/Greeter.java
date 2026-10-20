// Reference solution for exercise 23 (Del 2): two overloaded greet methods.
public class Greeter {
    public void greet() {
        System.out.println("Hei!");
    }

    public void greet(String name) {
        System.out.println("Hei, " + name + "!");
    }
}
