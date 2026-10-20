import pricing.Tax;

// Reference solution for exercise 30: the corrected class. The handout's version has no
// import at all, and the compiler cannot find Tax: the class lives in the
// pricing package. The other way out is to write the full name at the call
// site - pricing.Tax.computeVAT(100.0) - with no import line.
public class Main {
    public static void main(String[] args) {
        double vat = Tax.computeVAT(100.0);
        System.out.println("Moms: " + vat);
    }
}
