// Reference solution for exercise 37 - the program the exercise asks about.
public class LogicalOperatorPredictions {
    public static void main(String[] args) {
        boolean a = 5 > 3;   // true
        boolean b = 2 > 4;   // false
        System.out.println(a && b);    // false - && needs both
        System.out.println(a || b);    // true  - || needs one
        System.out.println(!a);        // false - ! flips it
        System.out.println(!a || b);   // false - both sides are false
    }
}
