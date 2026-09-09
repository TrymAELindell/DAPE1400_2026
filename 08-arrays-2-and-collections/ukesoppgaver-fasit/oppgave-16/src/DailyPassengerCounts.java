// Reference solution for exercise 16: print a 2D array of passenger counts row by row with nested
// loops, and sum every element.
public class DailyPassengerCounts {

    public static int sumAll(int[][] counts) {
        int sum = 0;
        for (int day = 0; day < counts.length; day++) {
            for (int departure = 0; departure < counts[day].length; departure++) {
                sum += counts[day][departure];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] passengerCounts = {
                {24, 31},
                {28, 19},
                {35, 22}
        };

        for (int day = 0; day < passengerCounts.length; day++) {
            String line = "";
            for (int departure = 0; departure < passengerCounts[day].length; departure++) {
                if (departure > 0) {
                    line += " ";
                }
                line += passengerCounts[day][departure];
            }
            System.out.println(line);
        }

        System.out.println("Til sammen: " + sumAll(passengerCounts) + " passasjerer");
    }
}
