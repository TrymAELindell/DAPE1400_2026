// Reference solution for exercise 34.
//
// The justification the task asks for: the two deposit rates are constants.
// They are used in more than one place, and they must never differ. They
// are also fixed by law, not by anything in the program. Writing 2.0 and
// 3.0 straight into each calculation would run exactly as well today. The
// cost comes when the rate changes. Then the person editing must find every
// place and change all of them. Nothing in the code tells them how many
// places there are. Ordinary fields on an object were the other candidate.
// They would let each object carry its own rate, and that is exactly what
// must not happen here.
public class Deposit {
    private static final double SMALL_BOTTLE_DEPOSIT = 2.0;
    private static final double LARGE_BOTTLE_DEPOSIT = 3.0;
    private static final double SMALL_BOTTLE_LIMIT = 0.5;

    public static double getDepositFor(double bottleLitres) {
        if (bottleLitres <= SMALL_BOTTLE_LIMIT) {
            return SMALL_BOTTLE_DEPOSIT;
        } else {
            return LARGE_BOTTLE_DEPOSIT;
        }
    }

    public static double getTotalDeposit(int smallBottles, int largeBottles) {
        return smallBottles * SMALL_BOTTLE_DEPOSIT + largeBottles * LARGE_BOTTLE_DEPOSIT;
    }
}
