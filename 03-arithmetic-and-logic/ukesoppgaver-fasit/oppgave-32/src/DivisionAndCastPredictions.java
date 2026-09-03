// Reference solution for exercise 32 - the program the exercise asks about.
public class DivisionAndCastPredictions {
    public static void main(String[] args) {
        int a = 9;
        int b = 4;
        System.out.println(a / b);              // 2  - integer division
        System.out.println(a % b);              // 1  - the remainder
        System.out.println(-a % b);             // -1 - the sign follows the dividend
        System.out.println((double) a / b);     // 2.25 - cast before dividing
        System.out.println((double) (a / b));   // 2.0  - cast after dividing
    }
}
