// Reference solution for exercise 26. The inner loop reads the length of the
// row it stands on, so rows of different lengths work.
public class GroupSums {
    public static void main(String[] args) {
        int[][] scores = {
            {80, 92},
            {75},
            {88, 90, 85}
        };

        for (int group = 0; group < scores.length; group++) {
            int sum = 0;
            for (int i = 0; i < scores[group].length; i++) {
                sum += scores[group][i];
            }
            System.out.println("Gruppe " + group + ": antall " + scores[group].length
                    + ", sum " + sum);
        }
    }
}
