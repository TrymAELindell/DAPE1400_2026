// Reference solution for exercise 19: ring is called twice and runs twice;
// announce is defined but never called, so its line never prints.
public class DoorbellMain {
    public static void main(String[] args) {
        Doorbell doorbell = new Doorbell();
        doorbell.ring();
        doorbell.ring();
    }
}
