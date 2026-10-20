// Reference solution for exercise 34 - the program the exercise asks about.
public class Main {
    public static void main(String[] args) {
        System.out.println((int) 3.9);    // 3  - cut, not rounded
        System.out.println((int) -3.9);   // -3 - cut towards zero

        double half = 5 / 2;
        System.out.println(half);         // 2.0 - integer division first

        double half2 = 5 / 2.0;
        System.out.println(half2);        // 2.5 - one operand is a double
    }
}
