// Reference solution for exercise 12. All four methods are static:
// they only use their parameters, so they need no object state.
//
// Exercise 13 asks the student to add an ordinary field and read it from
// one of these methods. That field is deliberately not here: the line
//     private double lastResult;
// plus a read of it inside add() gives
// "non-static variable lastResult cannot be referenced from a static
// context", which is the point of the drill. Keeping this file compiling
// leaves the discovery to the student; the explanation is in the Fasit.
public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
