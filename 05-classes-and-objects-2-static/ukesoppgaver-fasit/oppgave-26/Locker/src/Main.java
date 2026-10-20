// Reference solution for exercise 26: the run the exercise asks about -
// the two lines from the task that do compile. Line C
// (Locker.getLockerNr()) and the misleading line D
// (locker.getLockersInUse()) are discussed in the Fasit; C is left out
// here because it does not compile.
public class Main {
    public static void main(String[] args) {
        System.out.println(Locker.getLockersInUse());   // linje A
        Locker locker = new Locker(12);
        System.out.println(locker.getLockerNr());       // linje B
    }
}
