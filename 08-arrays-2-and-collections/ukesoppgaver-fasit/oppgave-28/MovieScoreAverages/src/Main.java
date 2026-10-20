// Reference solution for exercise 28 (Del 3): the average score per movie
// (column) in a 2D array of reviewer scores.
public class Main {

    public static void main(String[] args) {
        int[][] scores = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };

        double[] averages = ScoreTable.calculateColumnAverages(scores);
        for (int movie = 0; movie < averages.length; movie++) {
            System.out.println("Film " + (movie + 1) + " har gjennomsnittlig score " + averages[movie]);
        }
    }
}
