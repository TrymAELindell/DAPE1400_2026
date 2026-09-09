// Reference solution for exercise 11, the discovery drill.
//
// The line the task asks the student to try -
//     VAT_RATE = 0.30;
// - does not compile: "cannot assign a value to final variable VAT_RATE".
// It is left out here rather than commented in, so this file compiles;
// the explanation is the handout's Fasit. Without final the same line
// compiles happily, which is exactly what makes final worth writing.
public class ConstantMain {
    private static final double VAT_RATE = 0.25;

    public static void main(String[] args) {
        double netPrice = 100.0;
        System.out.println("Moms: " + netPrice * VAT_RATE + " kr");
    }
}
