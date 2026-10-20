// Reference solution for exercise 9, the discovery drill.
//
// Integer.MAX_VALUE and friends are static fields on the wrapper classes:
// read straight off the class name, with no object anywhere. Adding 1 to
// the largest int wraps around to the smallest one - the surprise the
// task asks the student to predict first.
public class Main {
    public static void main(String[] args) {
        System.out.println("Største int: " + Integer.MAX_VALUE);
        System.out.println("Minste int: " + Integer.MIN_VALUE);
        System.out.println("Største double: " + Double.MAX_VALUE);
        System.out.println("Minste positive double: " + Double.MIN_VALUE);

        int oneTooFar = Integer.MAX_VALUE + 1;
        System.out.println("Største int pluss 1: " + oneTooFar);
    }
}
