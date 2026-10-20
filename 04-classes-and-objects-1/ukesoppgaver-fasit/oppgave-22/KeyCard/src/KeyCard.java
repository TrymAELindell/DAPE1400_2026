// Reference solution for exercise 22 (explain the purpose): the pin can be
// changed only by someone who proves they know the old one, and checked
// without ever being revealed - private field, no getter.
public class KeyCard {
    private String pin;

    public KeyCard(String pin) {
        this.pin = pin;
    }

    public void setPin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)) {
            this.pin = newPin;
        } else {
            System.out.println("Feil pin. Koden ble ikke endret.");
        }
    }

    public boolean checkPin(String attempt) {
        return this.pin.equals(attempt);
    }
}
