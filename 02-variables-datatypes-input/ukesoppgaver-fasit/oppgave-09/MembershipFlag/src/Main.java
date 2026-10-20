// Reference solution for exercise 9.
public class Main {
    public static void main(String[] args) {
        // Declaring only reserves space - there is no value in it yet.
        boolean member;

        member = false;
        System.out.println("Medlem: " + member);

        // The same variable gets a new value; the old one is overwritten.
        member = true;
        System.out.println("Medlem: " + member);
    }
}
