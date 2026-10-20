// Reference solution for exercise 31: the calculations on the score table.
public class ScoreTable {

    // The average score per film (column).
    // Samme framgangsmåte som i oppgave 28.
    public static double[] calculateColumnAverages(int[][] scores) {
        int nrOfReviewers = scores.length;
        int nrOfMovies = scores[0].length;

        double[] averages = new double[nrOfMovies];
        for (int movie = 0; movie < nrOfMovies; movie++) {
            int sum = 0;
            for (int reviewer = 0; reviewer < nrOfReviewers; reviewer++) {
                sum += scores[reviewer][movie];
            }
            averages[movie] = (double) sum / nrOfReviewers;
        }
        return averages;
    }

    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 9;
    }

    public static int findWinnerIndex(double[] averages) {
        // Assumption: if two films tie for the best average, the first of
        // them counts as the winner of the evening.
        int winner = 0;
        for (int film = 1; film < averages.length; film++) {
            if (averages[film] > averages[winner]) {
                winner = film;
            }
        }
        return winner;
    }
}
