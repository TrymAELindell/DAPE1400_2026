// Reference solution for exercise 35 — the corrected program.
// The bug: totalPoints and rounds are both int, so / does integer
// division (22 / 4 = 5) before the result is stored in the double.
// Casting one operand to double makes the division keep the decimals.
public class AveragePointsFixed {
    public static void main(String[] args) {
        int totalPoints = 22;
        int rounds = 4;
        double average = (double) totalPoints / rounds;
        System.out.println("Snittet er " + average + " poeng per runde");   // 5.5
    }
}
