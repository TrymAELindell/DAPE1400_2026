// Reference solution for exercise 19 (predict the output): a method definition
// runs only when the method is called - once per call, never on its own.
public class Doorbell {
    public void ring() {
        System.out.println("Ding dong!");
    }

    public void announce() {
        System.out.println("Det er noen på døra.");
    }
}
