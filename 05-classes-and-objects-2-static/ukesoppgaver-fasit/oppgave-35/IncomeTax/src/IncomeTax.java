// Reference solution for exercise 35 (Del 3).
//
// The justification the task asks for: static methods on a class that holds
// no data. Every number the calculation needs comes in as the income
// parameter or is already in the constants. So the class has nothing to
// store for each taxpayer. An ordinary method would work exactly as well.
// The cost is that every caller must write new IncomeTax() first. The
// caller then carries an object that gives the same answer, no matter which
// object it is. The rates are constants, not numbers written straight into
// the code, for a different reason. They appear in more than one method,
// and they change every year. So they must be easy to find, in one place.
//
// Bracket limits and rates follow skatteetaten.no/satser/trinnskatt/ and
// must be updated when the yearly rates change.
public class IncomeTax {
    private static final double TAX_FREE_LIMIT = 100000;
    private static final double BASE_TAX_RATE = 0.22;

    private static final double BRACKET_1_LIMIT = 217400;
    private static final double BRACKET_2_LIMIT = 306050;
    private static final double BRACKET_3_LIMIT = 697150;
    private static final double BRACKET_4_LIMIT = 942400;
    private static final double BRACKET_5_LIMIT = 1410750;

    private static final double BRACKET_1_RATE = 0.017;
    private static final double BRACKET_2_RATE = 0.040;
    private static final double BRACKET_3_RATE = 0.137;
    private static final double BRACKET_4_RATE = 0.167;
    private static final double BRACKET_5_RATE = 0.177;

    // Exercise 35, first step: no tax below the tax-free limit,
    // 22 percent of everything above it
    public static double calculateBaseTax(double income) {
        if (income < TAX_FREE_LIMIT) {
            return 0.0;
        } else {
            double taxable = income - TAX_FREE_LIMIT;
            return taxable * BASE_TAX_RATE;
        }
    }

    // Exercise 35, second step: each bracket taxes the part of the income that
    // falls inside it. Math.min is a static method that returns the
    // smaller of its two arguments - it caps each part at the bracket top.
    public static double calculateBracketTax(double income) {
        double bracketTax = 0.0;

        if (income > BRACKET_1_LIMIT) {
            double inBracket = Math.min(income, BRACKET_2_LIMIT) - BRACKET_1_LIMIT;
            bracketTax = bracketTax + inBracket * BRACKET_1_RATE;
        }
        if (income > BRACKET_2_LIMIT) {
            double inBracket = Math.min(income, BRACKET_3_LIMIT) - BRACKET_2_LIMIT;
            bracketTax = bracketTax + inBracket * BRACKET_2_RATE;
        }
        if (income > BRACKET_3_LIMIT) {
            double inBracket = Math.min(income, BRACKET_4_LIMIT) - BRACKET_3_LIMIT;
            bracketTax = bracketTax + inBracket * BRACKET_3_RATE;
        }
        if (income > BRACKET_4_LIMIT) {
            double inBracket = Math.min(income, BRACKET_5_LIMIT) - BRACKET_4_LIMIT;
            bracketTax = bracketTax + inBracket * BRACKET_4_RATE;
        }
        if (income > BRACKET_5_LIMIT) {
            double inBracket = income - BRACKET_5_LIMIT;
            bracketTax = bracketTax + inBracket * BRACKET_5_RATE;
        }

        return bracketTax;
    }

    // Exercise 35, third step: total tax with a breakdown
    public static double calculateTotalTax(double income) {
        return calculateBaseTax(income) + calculateBracketTax(income);
    }

    public static String describeTax(double income) {
        double baseTax = calculateBaseTax(income);
        double bracketTax = calculateBracketTax(income);
        return "Total skatt: " + (baseTax + bracketTax) + " kr"
                + "\nHerav grunnskatt: " + baseTax + " kr"
                + "\nHerav trinnskatt: " + bracketTax + " kr";
    }
}
