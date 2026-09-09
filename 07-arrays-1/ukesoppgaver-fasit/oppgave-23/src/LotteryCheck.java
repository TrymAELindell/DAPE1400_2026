import java.util.Arrays;

// Reference solution for exercise 23. Arrays.equals compares position by
// position, so the same numbers in another order give false.
public class LotteryCheck {
    public static void main(String[] args) {
        int[] drawn = {34, 7, 21, 2, 19, 28, 11};
        int[] coupon = {2, 7, 11, 19, 21, 28, 34};

        int[] sortedDrawn = Arrays.copyOf(drawn, drawn.length);
        Arrays.sort(sortedDrawn);

        if (Arrays.binarySearch(sortedDrawn, 19) >= 0) {
            System.out.println("Tallet 19 ble trukket ut");
        } else {
            System.out.println("Tallet 19 ble ikke trukket ut");
        }

        if (Arrays.binarySearch(sortedDrawn, 20) >= 0) {
            System.out.println("Tallet 20 ble trukket ut");
        } else {
            System.out.println("Tallet 20 ble ikke trukket ut");
        }

        System.out.println("Kupongen er identisk med trekningen: " + Arrays.equals(drawn, coupon));
    }
}
