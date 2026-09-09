// Reference solution for exercise 46.
//
// Fasit comment (the choice): this solution keeps the measurements in
// a two-dimensional array with one row per station, so one loop
// averages every station with the same code. Another good solution is
// three separate arrays, one per station; the averaging code must then
// run three times by name, and a fourth station means new code.
public class RainAverages {
    public static void main(String[] args) {
        String[] stations = {"Blindern", "Bergen", "Tromsø"};
        double[][] rainfall = {
            {2.0, 0.0, 5.5, 1.5, 0.0, 3.0, 2.0},
            {8.0, 12.5, 6.0, 9.5, 15.0, 7.0, 12.0},
            {1.0, 3.5, 0.0, 2.5, 4.0, 0.0, 3.0}
        };

        for (int station = 0; station < rainfall.length; station++) {
            double sum = 0;
            for (double measurement : rainfall[station]) {
                sum += measurement;
            }
            double average = sum / rainfall[station].length;
            System.out.println(stations[station] + ": " + average + " mm i snitt");
        }
    }
}
