// Reference solution for exercise 27.
//
// Four fixed lines, printed once, for one guest: plain println statements
// are the whole job. A class with fields, a constructor and a print method
// would also produce this output - and for a single badge with values that
// never change, that is three pieces of machinery bought for no reuse. The
// class starts paying for itself the moment there is a second guest with
// the same shape, which is exactly exercise 28's situation.
public class ConferenceBadge {
    public static void main(String[] args) {
        System.out.println("JavaDagen");
        System.out.println("Ada Lovelace");
        System.out.println("Analytical Engines AS");
        System.out.println("Foredragsholder");
    }
}
