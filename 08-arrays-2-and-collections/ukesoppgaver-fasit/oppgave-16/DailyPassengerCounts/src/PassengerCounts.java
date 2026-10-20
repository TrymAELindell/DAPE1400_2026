// Reference solution for exercise 16: sum every element in the 2D array of passenger counts.
public class PassengerCounts {

    public static int sumAll(int[][] counts) {
        int sum = 0;
        for (int day = 0; day < counts.length; day++) {
            for (int departure = 0; departure < counts[day].length; departure++) {
                sum += counts[day][departure];
            }
        }
        return sum;
    }
}
