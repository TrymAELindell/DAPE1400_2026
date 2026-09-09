// Reference solution for exercise 41.
//
// Fasit comment (the choice): this solution uses three plain double
// variables, because three fixed values need two additions and two
// comparisons. Another good solution is an array with a loop, this
// week's pattern; with only three values the loop adds code but no
// benefit, and it wins only when the number of values grows.
public class ThreeTemperatures {
    public static void main(String[] args) {
        double morning = -3.0;
        double midday = 4.5;
        double evening = 1.5;

        double average = (morning + midday + evening) / 3;

        double highest = morning;
        if (midday > highest) {
            highest = midday;
        }
        if (evening > highest) {
            highest = evening;
        }

        System.out.println("Gjennomsnitt: " + average);
        System.out.println("Høyest: " + highest);
    }
}
