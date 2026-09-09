// Reference solution for exercise 12. The methods are called on the class itself -
// no Calculator object is instantiated anywhere.
public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("2.5 + 4.0 = " + Calculator.add(2.5, 4.0));
        System.out.println("2.5 - 4.0 = " + Calculator.subtract(2.5, 4.0));
        System.out.println("2.5 * 4.0 = " + Calculator.multiply(2.5, 4.0));
        System.out.println("2.5 / 4.0 = " + Calculator.divide(2.5, 4.0));
    }
}
