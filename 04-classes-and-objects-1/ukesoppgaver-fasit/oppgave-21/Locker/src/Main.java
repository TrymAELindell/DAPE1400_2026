// Reference solution for exercise 21: lines A and C compile; B and D do not.
public class Main {
    public static void main(String[] args) {
        Locker locker = new Locker(1234, "Ada");
        System.out.println(locker.owner);        // linje A
        // System.out.println(locker.code);      // linje B
        System.out.println(locker.getCode());    // linje C
        // locker.resetCode();                   // linje D
    }
}
