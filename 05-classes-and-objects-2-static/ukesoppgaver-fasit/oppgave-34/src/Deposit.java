// Reference solution for exercise 34.
//
// The justification the task asks for: the two deposit rates are
// constants. They are used in more than one place, they must never drift
// apart, and they are fixed by law rather than by anything in the
// program. Writing 2.0 and 3.0 straight into each calculation would run
// exactly as well today - and that is the cost: the day the rate changes,
// the person editing has to find every site and get all of them, and
// nothing in the code tells them how many there are. Ordinary fields on
// an object were the other candidate; they would let each object carry
// its own rate, which is precisely the thing that must not happen here.
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
