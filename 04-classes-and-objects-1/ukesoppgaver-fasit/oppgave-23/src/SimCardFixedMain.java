// Reference solution for exercise 23: the setter now rejects "12" with a
// warning instead of storing it.
public class SimCardFixedMain {
    public static void main(String[] args) {
        SimCardFixed card = new SimCardFixed("1234");
        card.setPin("12");
    }
}
