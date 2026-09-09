// Reference solution for exercise 34.
public class DepositMain {
    public static void main(String[] args) {
        System.out.println("Pant for en 0,33-liter: " + Deposit.getDepositFor(0.33) + " kr");
        System.out.println("Pant for en 1,5-liter: " + Deposit.getDepositFor(1.5) + " kr");
        System.out.println("Pant for 6 små og 4 store: "
                + Deposit.getTotalDeposit(6, 4) + " kr");
    }
}
