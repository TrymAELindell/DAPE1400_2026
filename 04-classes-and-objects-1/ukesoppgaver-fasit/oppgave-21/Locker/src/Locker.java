// Reference solution for exercise 21 (which lines compile): access levels
// apply to fields and methods alike. owner is public only so the handout
// can show the difference - the course rule is that fields are private.
public class Locker {
    private int code;
    public String owner;

    public Locker(int code, String owner) {
        this.code = code;
        this.owner = owner;
    }

    public int getCode() {
        return this.code;
    }

    private void resetCode() {
        this.code = 0;
    }
}
