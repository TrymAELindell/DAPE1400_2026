// Reference solution for exercise 22: demonstrates the guarded change and the
// reveal-free check.
public class Main {
    public static void main(String[] args) {
        KeyCard card = new KeyCard("4321");

        card.setPin("0000", "1111");            // wrong old pin: prints a warning
        System.out.println(card.checkPin("4321"));   // true - unchanged

        card.setPin("4321", "1111");            // correct old pin: changes it
        System.out.println(card.checkPin("1111"));   // true
    }
}
