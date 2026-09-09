// Reference solution for exercise 28 (Del 3): the average score per movie
// (column) in a 2D array of reviewer scores.
public class MovieScoreAverages {

    // A 2D array with nested loops fits here: the scores are a fixed grid
    // of reviewers times movies, known up front, and the grid shape lets
    // one loop pattern handle any number of movies. The alternative — one
    // sum variable per movie in a single loop — also works for four
    // movies, but every added movie means another variable and another
    // line, which is the pattern loops exist to remove.
    public static double[] columnAverages(int[][] scores) {
        int nrOfReviewers = scores.length;
        int nrOfMovies = scores[0].length;

        double[] averages = new double[nrOfMovies];
        // The outer loop walks the movies (columns), the inner loop the
        // reviewers (rows), so each column sum is complete before dividing.
        for (int movie = 0; movie < nrOfMovies; movie++) {
            int sum = 0;
            for (int reviewer = 0; reviewer < nrOfReviewers; reviewer++) {
                sum += scores[reviewer][movie];
            }
            averages[movie] = (double) sum / nrOfReviewers;
        }
        return averages;
    }

    public static void main(String[] args) {
        int[][] scores = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };

        double[] averages = columnAverages(scores);
        for (int movie = 0; movie < averages.length; movie++) {
            System.out.println("Film " + (movie + 1) + " har gjennomsnittlig score " + averages[movie]);
        }
    }
}
