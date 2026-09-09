// Reference solution for exercise 26: the class the exercise asks about. One static counter on the class, one
// locker number per object - the two halves the four lines in main probe.
public class Locker {
    private static int lockersInUse = 0;
    private int lockerNr;

    public Locker(int lockerNr) {
        this.lockerNr = lockerNr;
        lockersInUse++;
    }

    public int getLockerNr() {
        return this.lockerNr;
    }

    public static int getLockersInUse() {
        return lockersInUse;
    }
}
