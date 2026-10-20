// Reference solution for exercise 28: the calculation on the score table.
public class ScoreTable {

    // En todimensjonal array med nested looper passer her. Poengene er et
    // fast rutenett av anmeldere ganger filmer, kjent fra starten. Formen på
    // rutenettet lar ett loopmønster håndtere et hvilket som helst antall
    // filmer. Alternativet er én sumvariabel per film i én enkelt loop. Det
    // virker også for fire filmer. Men hver nye film betyr en ny variabel og
    // en ny linje. En loop fjerner akkurat den typen gjentakelse.
    public static double[] calculateColumnAverages(int[][] scores) {
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
}
