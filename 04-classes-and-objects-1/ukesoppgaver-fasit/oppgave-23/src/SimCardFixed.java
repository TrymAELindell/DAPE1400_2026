// Reference solution for exercise 23 (find the bug): the broken version had no
// check in setPin, so the setter was an open back door around the
// constructor's rule. The rule now lives in one private method that both
// ways in use - the same move as exercise 14.
public class SimCardFixed {
    private String pin;

    public SimCardFixed(String pin) {
        if (this.hasValidPin(pin)) {
            this.pin = pin;
        } else {
            System.out.println("Advarsel: pin-koden må ha fire siffer.");
        }
    }

    public void setPin(String pin) {
        if (this.hasValidPin(pin)) {
            this.pin = pin;
        } else {
            System.out.println("Advarsel: pin-koden må ha fire siffer.");
        }
    }

    private boolean hasValidPin(String pin) {
        return pin.length() == 4;
    }
}
